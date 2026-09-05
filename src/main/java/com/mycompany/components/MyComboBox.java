package com.mycompany.components;

import com.mycompany.theme.UIConstants;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.BorderUIResource;

public class MyComboBox<T> extends JComboBox<T> {
    public MyComboBox(){
        setFont(UIConstants.FONT_PRIMARY);
        setBackground(UIConstants.BG_COLOR);
        setForeground(UIConstants.TEXT_COLOR);
        setPreferredSize(UIConstants.FIELD_DIMENSION);
        setMaximumSize(UIConstants.FIELD_DIMENSION);
        setBorder(new BorderUIResource.EtchedBorderUIResource(12,Color.WHITE,Color.BLUE));
        //setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    public MyComboBox(T[] items) {
        super(items);
        setFont(UIConstants.FONT_PRIMARY);
        setBackground(Color.WHITE);
        setForeground(UIConstants.TEXT_COLOR);
        setPreferredSize(UIConstants.FIELD_DIMENSION);
        setMaximumSize(UIConstants.FIELD_DIMENSION);
        //setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
