*Wellness Destinations Slide Show*


Project Overview
This is a Java-based desktop application that showcases a curated collection of top wellness destinations around the world. 
The application presents a slideshow interface with high-quality images and descriptive captions for each destination.

Technical Details
Project Structure

Slide Show/
├── src/
├── SlideShow.java        # Main application file
└── resources/            # Image resources directory
├── iceland_bluelagoon.jpg
├── bali_yoga_retreat.jpg
├── sedona_spa.jpg
├── costa_rica_ecolodge.jpg
└── swiss_thermal_baths.jpg
└── bin/                      # Compiled class files

*Development Environment*

Java Version: Java SE 8 (1.8)
IDE: Eclipse
Project Type: Java Swing Application
Character Encoding: UTF-8
Key Features
Interactive Navigation

Previous/Next buttons for manual slideshow control
Smooth transitions between slides using CardLayout
Professional UI Components

High-resolution destination images (800x450 pixels)
Formatted HTML captions with destination names and descriptions
Clean, modern interface with proper spacing and borders
Featured Destinations

Blue Lagoon, Iceland - Geothermal seawater spa
Ubud, Bali - Yoga & mindfulness retreats
Sedona, Arizona - Red-rock hikes and desert spas
Costa Rica - Rainforest eco-lodges
Swiss Alps - Thermal baths

Technical Implementation
UI Framework: Java Swing
Layout Managers:
BorderLayout for main frame
CardLayout for image and caption transitions
FlowLayout for navigation buttons

Image Handling:
Smooth image scaling using Image.SCALE_SMOOTH
Resource loading from classpath

Memory Efficiency:
Images loaded from resources as needed
Proper resource management

User Interface Details
Window Size: 820x600 pixels
Image Display Area: 800x450 pixels
Custom styling:
Caption background: Light gray (RGB: 245, 247, 250)
Caption font: SansSerif, 14pt
Proper padding and margins throughout

*Running the Application*
The application can be launched by running the SlideShow class. The main method utilizes EventQueue.invokeLater() for proper Swing thread management.

*Dependencies*
Java SE 8 or higher
Standard Java Swing libraries
No external dependencies required

*Project Configuration*
Source folders properly configured in Eclipse
Java compiler settings optimized for debug information
UTF-8 encoding is enforced project-wide
Resources configured as a source folder for proper classpath access
