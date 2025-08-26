package com.pharmacare.main;

import com.pharmacare.view.LoginView;

public class App {
    public static void main(String[] args) {
        // Create an object of our LoginView
        LoginView loginScreen = new LoginView();
        
        // Center the window on the screen
        loginScreen.setLocationRelativeTo(null);
        
        // Make the window visible
        loginScreen.setVisible(true);
    }
}