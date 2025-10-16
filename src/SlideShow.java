import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * SlideShow
 *
 * Module 5 update:
 * - Wellness/detox theme per Product Owner.
 * - Loads 5 destination images from classpath (src/resources).
 * - Shows caption under photo and above buttons.
 * - Adds concise comments explaining changes (for rubric).
 */
public class SlideShow extends JFrame {

    // ----- constants / data -----
    private static final int SLIDE_W = 800;
    private static final int SLIDE_H = 450; // leave room for caption + buttons

    // Images are at CLASSPATH ROOT because src/resources is a Source Folder.
    // => Do NOT prefix with "resources/". Use the bare filenames.
    private static final String[] IMAGE_FILES = {
        "iceland_bluelagoon.jpg",
        "bali_yoga_retreat.jpg",
        "sedona_spa.jpg",
        "costa_rica_ecolodge.jpg",
        "swiss_thermal_baths.jpg"
    };

    private static final String[] CAPTIONS_HTML = {
        "<html><body><b>#1 Blue Lagoon, Iceland</b> — Geothermal seawater spa for deep relaxation.</body></html>",
        "<html><body><b>#2 Ubud, Bali</b> — Yoga & mindfulness retreats amid rice terraces.</body></html>",
        "<html><body><b>#3 Sedona, Arizona</b> — Red-rock hikes, meditation, and desert spas.</body></html>",
        "<html><body><b>#4 Costa Rica</b> — Rainforest eco-lodges, hot springs, and wellness cuisine.</body></html>",
        "<html><body><b>#5 Swiss Alps</b> — Thermal baths and crisp mountain-air recovery.</body></html>"
    };

    // ----- UI containers & card managers -----
    private final JPanel slidePane  = new JPanel();   // holds images
    private final JPanel textPane   = new JPanel();   // holds captions
    private final JPanel buttonPane = new JPanel();   // holds nav buttons
    private final CardLayout cardImg  = new CardLayout();
    private final CardLayout cardText = new CardLayout();

    public SlideShow() {
        initComponent();
    }

    /** Build UI and wire behavior. */
    private void initComponent() {
        // Frame
        setTitle("Top 5 Wellness Destinations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(820, 600));
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout(10, 10));

        // Slides (center)
        slidePane.setLayout(cardImg);
        slidePane.setBackground(Color.BLACK);

        // Captions (south, above buttons)
        textPane.setLayout(cardText);
        textPane.setBackground(new Color(245, 247, 250));
        textPane.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));
        final Font captionFont = new Font("SansSerif", Font.PLAIN, 14);

        // Build 5 slides as paired cards with matching keys
        for (int i = 0; i < IMAGE_FILES.length; i++) {
            JLabel imgLabel = new JLabel(loadScaledIcon(IMAGE_FILES[i], SLIDE_W, SLIDE_H));
            imgLabel.setHorizontalAlignment(JLabel.CENTER);
            slidePane.add(imgLabel, "card" + i);

            JLabel txtLabel = new JLabel(CAPTIONS_HTML[i]);
            txtLabel.setFont(captionFont);
            textPane.add(txtLabel, "text" + i);
        }

        // Navigation
        JButton btnPrev = new JButton("Previous");
        JButton btnNext = new JButton("Next");

        btnPrev.addActionListener((ActionEvent e) -> {
            cardImg.previous(slidePane);
            cardText.previous(textPane);
        });
        btnNext.addActionListener((ActionEvent e) -> {
            cardImg.next(slidePane);
            cardText.next(textPane);
        });

        buttonPane.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 8));
        buttonPane.add(btnPrev);
        buttonPane.add(btnNext);

        // Bottom wrapper: caption ABOVE buttons in SOUTH
        JPanel bottom = new JPanel(new BorderLayout());
        bottom.add(textPane, BorderLayout.CENTER);
        bottom.add(buttonPane, BorderLayout.SOUTH);

        getContentPane().add(slidePane, BorderLayout.CENTER);
        getContentPane().add(bottom, BorderLayout.SOUTH);
    }

    /**
     * Load an ImageIcon from the classpath and scale it smoothly.
     * Assumes files live at the classpath root (src/resources as Source Folder).
     */
    private ImageIcon loadScaledIcon(String fileName, int w, int h) {
        // Leading "/" = look from classpath root
        java.net.URL url = getClass().getResource("/" + fileName);
        if (url == null) {
            throw new IllegalStateException("Image not on classpath: " + fileName);
        }
        Image scaled = new ImageIcon(url).getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }

    /** Launch the application. */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SlideShow ss = new SlideShow();
            ss.setVisible(true);
        });
    }
}
