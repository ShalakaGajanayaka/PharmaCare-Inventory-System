package com.pharmacare.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.pharmacare.view.LoginView;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class App {
    public static void main(String[] args) {
        // --- THIS IS THE THEME CODE ---
        try {
           // Set the flatlaf light theme
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.err.println("Failed to initialize LaF");
        }
        // --- THEME CODE ENDS HERE ---
       
        
        // Start the application on the correct thread
        SwingUtilities.invokeLater(()->{
            LoginView loginScreen = new LoginView();
            loginScreen.setLocationRelativeTo(null);
            loginScreen.setVisible(true);
        });
    }
}