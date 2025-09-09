package com.pharmacare.customui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {

    private Color backgroundColor;
    private int cornerRadius = 15;

    // --- වෙනස්කම් #1: සරල, default constructor එකක් ---
    // NetBeans GUI builder එක මේ වගේ සරල constructor එකකට ගොඩක් කැමතියි.
    public RoundedPanel() {
        super();
        // --- වෙනස්කම් #2: Panel එක non-opaque (โปร่งใส) කිරීම ---
        // මේක තමයි වැදගත්ම දේ. මේකෙන් Swing වලට කියනවා default හතරැස් background එක අඳින්න එපා කියලා.
        // අපි අපේම rounded background එක ඇඳගන්නවා.
        setOpaque(false);
    }

    // අනිත් constructors ටිකත් තියාගන්න පුළුවන් code එකේදී පාවිච්චි කරන්න
    public RoundedPanel(LayoutManager layout, int radius) {
        super(layout);
        setOpaque(false);
        this.cornerRadius = radius;
    }

    public RoundedPanel(int radius) {
        super();
        setOpaque(false);
        this.cornerRadius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        // අපි super.paintComponent(g) call කරන්නේ painting chain එකට ගරු කරන්න.
        // ඒත් panel එක opaque නැති නිසා, ඒක default background එක අඳින්නේ නෑ.
        super.paintComponent(g);

        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;

        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Rounded rectangle එකට පාට දීම
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }

        // Rounded rectangle එක fill කිරීම
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
    }

    // --- Getters සහ Setters ටික ඒ විදිහටම තියෙනවා ---
    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        // Design View එකේ වෙනස්කම් පේන්න මේක අත්‍යවශ්‍යයි
        repaint();
    }

    // Background color එකටත් getter/setter එකක්
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        repaint();
    }
}
