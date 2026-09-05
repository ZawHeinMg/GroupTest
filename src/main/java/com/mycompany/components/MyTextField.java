package com.mycompany.components;

import com.mycompany.theme.UIConstants;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.border.MatteBorder;

public class MyTextField extends JTextField {

    public MyTextField() {
        setFont(UIConstants.FONT_PRIMARY);
        setForeground(UIConstants.TEXT_COLOR);
        setPreferredSize(UIConstants.FIELD_DIMENSION);
        setMaximumSize(UIConstants.FIELD_DIMENSION);
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setOpaque(false);
        setBackground(new java.awt.Color(0, 0, 0, 0));
        // Clean border with padding inside the input field
        setBorder(new MatteBorder(0,0,2,0,UIConstants.BORDER_COLOR));
    }
    public void addPlaceholder( String placeholder) {
    // Set initial placeholder state
    setText(placeholder);
    setForeground(Color.GRAY);

    addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent e) {
            // Clear placeholder when user clicks in
            if (getText().equals(placeholder)) {
                setText("");
                setForeground(new java.awt.Color(204,204,225)); // Set your normal text color
            }
        }

        @Override
        public void focusLost(java.awt.event.FocusEvent e) {
            // Restore placeholder if field was left empty
            if (getText().isEmpty()) {
                setText(placeholder);
                setForeground(Color.LIGHT_GRAY);
            }
        }
    });
}
}