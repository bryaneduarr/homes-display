# Homes Android UI
This is an app made in Android Studio using Java. 
This app is a UI inspired by: (All Trails)[https://mobbin.com/screens/9c971a51-b344-4031-ad94-c623b3ce9f76].

Made it using **Gradle 8.7**, **Android Studio 2024.1.1 Patch 2**.
Tested using **Pixel 8 Pro Android 13, API 33** integrated emulator.

## Bug found
LSP complaining about **FilterModels.java** this is because I changed the name of the package from **products** to **homes**.

To solve it just rename the class to **FilterModel** and then rename it back to **FilterModels**.