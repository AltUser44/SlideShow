**Wellness Destinations Slide Show**


This is a Java-based desktop application that showcases a curated collection of top wellness destinations around the world. 
The application presents a slideshow interface with high-quality images and descriptive captions for each destination.


<img width="803" height="590" alt="Screenshot 2025-10-15 204445" src="https://github.com/user-attachments/assets/ef331a84-17b2-4dfb-9a57-a55070c7e19a" />


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

**Development Environment**

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

**Dependencies**

Java SE 8 or higher
Standard Java Swing libraries
No external dependencies required

**Project Configuration**

Source folders properly configured in Eclipse
Java compiler settings optimized for debug information
UTF-8 encoding is enforced project-wide
Resources configured as a source folder for proper classpath access



# CS-250 Portfolio Artifact

This repository contains my portfolio artifact for CS 250 - Software Development Lifecycle.

## Artifact: Sprint Review and Retrospective
*   **File:** [CS250/Sprint_Review_Retrospective.pdf](CS250/sprintreview.pdf)
*   **Description:** This document reflects on my experience applying Agile and Scrum principles in the SNHU Travel Wellness Project, covering roles, user stories, and process evaluation.

## Essential Questions Reflection

**How do I identify user needs and incorporate them into a program? ** How does creating “user stories” help with this?**

["I interpret user needs by closely collaborating with the Product Owner and stakeholders to understand the business goals and user pain points. In the SNHU Travel project, this meant shifting our focus to wellness destinations based on new requirements. Creating 'user stories' is crucial for this process because they break down large, complex needs into small, actionable units of value from the user's perspective. For instance, a story like 'As a wellness traveler, I want to see a slideshow of detox retreats so that I can find inspiration for my next trip' gave me a clear, testable goal to implement in code, ensuring the feature I built directly addressed a user need."]

**How do I approach developing programs? What Agile processes do I hope to incorporate into my future development work?**

["My approach to development is iterative and collaborative, heavily influenced by Agile. I focus on delivering small, working pieces of software frequently rather than trying to build everything at once. For my future work, I hope to incorporate several key Agile processes. First, the use of short sprints to maintain focus and adaptability. Second, daily stand-up meetings to ensure clear communication and quickly address blockers. Finally, I value the practice of sprint reviews and retrospectives, as they create a formal feedback loop for both the product and the team's workflow, fostering continuous improvement."]

**What does it mean to be a good team member in software development?**

["Being a good team member in software development means being reliable, communicative, and collaborative. It involves proactively updating the team on your progress and challenges in daily stand-ups, as I did in this project. It also means being transparent when you need help and being willing to help others. A good team member respects the defined processes, like the roles in Scrum, and contributes to a positive team dynamic by actively participating in ceremonies like sprint planning and retrospectives, always focusing on the collective goal of delivering value to the customer."]
