# TierRallye-AndroidApp

## Overview

This repository contains the Android Studio project developed as part of the **"Informatik 2"** module during the Winter Semester 2024/25. The primary goal was to design and implement an interactive, child-friendly mobile application that guides users through a fictional animal rally in the **Wildpark Grafenberg Düsseldorf**. The project was realized entirely from scratch using Android Studio with a combination of **Java**, **Kotlin**, and **XML-based UI design**.

The application provides a playful learning environment, allowing children to explore animals, read short stories, and test their knowledge through quizzes—all in a clean, intuitive interface designed for young users.

---

## Key Objectives

### User Interface Design
- Design a clean, accessible, and engaging interface for children using XML layouts.
- Integrate custom drawable resources (animal icons, background images) for visual clarity.

### Application Structure
- Develop multiple `Activity` classes for modular navigation (home screen, map view, animal info pages, quiz screen).
- Connect all screens using explicit `Intent`-based navigation logic in Kotlin.

### Interactive Learning Features
- Present educational content for selected animals (raccoon, wild boar, deer).
- Implement a quiz system with scoring logic to reinforce learning through play.

### Child-Focused Design
- Use large icons, friendly text, and nature-themed color palettes (green tones) to ensure a safe and intuitive user experience.
- Provide a structured experience flow: start page → map → animal → story → quiz.

---

## Core Features

### Multi-Activity Navigation
Modular design with separate activities for each functional unit (e.g. main screen, animal pages, quiz).

### Quiz System
Each animal page contains a simple multiple-choice quiz. Users are rewarded with points for correct answers.

### Custom UI Design
All UI elements were hand-crafted in XML using relative and linear layouts, designed specifically for a touch-friendly experience.

### Local Asset Integration
Icons and map backgrounds were imported manually into the project’s drawable directory, ensuring consistent offline functionality.

### Data Privacy Page
A dedicated section explains in child-friendly terms how data (e.g. location access in future versions) is or will be handled.

---

## Technologies Used

- **Programming Languages**: Java, Kotlin  
- **UI Layouts**: XML  
- **IDE**: Android Studio  
- **Build System**: Gradle  
- **Version Control**: Git & GitHub  
- **Target Platform**: Android 8.0+  
- **Testing Devices**: Android Emulator, physical Android smartphone  

---

## Getting Started

### Prerequisites

- Android Studio (Electric Eel or newer)
- Git installed for version control
- Android Emulator or real Android device (API 26+)

### Installation

1. Clone the repository:

git clone https://github.com/gshaipov/Wild-Tracks-App.git

2. Open the project in Android Studio

- Go to **File > Open**
- Select the project folder
- Wait for Gradle to finish syncing

3. Run the app

- Use the **Run** button to deploy the app to an emulator or a connected Android device

---

### Usage

- Launch the app
- On the home screen, tap **Start Tier-Rallye** to begin
- Tap on an animal icon (**Waschbär**, **Wildschwein**, **Hirsch**) to view its story
- Start the quiz and answer multiple-choice questions to earn points
- Use the **Karte** button to explore the map directly
- Access the **Datenschutz** section for app transparency

---

### Project Highlights

- Developed fully from scratch – no templates or external libraries  
- Implemented clean separation of UI and logic  
- Designed for children with playful visual design and ease of use  
- Achieved **2nd place** in the final university project evaluation  

---

### Future Enhancements

- Add animations and sounds for greater engagement  
- Include more animal profiles and quiz variations  
- Implement user progress tracking and reward systems  
- Translate content into multiple languages for broader reach  
- Potential location-based features (planned for future versions)
