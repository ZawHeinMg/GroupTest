package com.mycompany.components;

import com.mycompany.theme.UIConstants;
import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    public MyButton(){
        setFont(UIConstants.FONT_BOLD);
        setBackground(UIConstants.PRIMARY_COLOR);
        setForeground(Color.WHITE);
        setPreferredSize(UIConstants.BUTTON_DIMENSION);
        setMaximumSize(UIConstants.BUTTON_DIMENSION);
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }

}
