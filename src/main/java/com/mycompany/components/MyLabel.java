package com.mycompany.components; // Belongs to components package

import com.mycompany.theme.UIConstants;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class MyLabel extends JLabel {

   // private JLabel label = new JLabel();
    public MyLabel(){
        
       setFont(new Font("Times New Roman", Font.ITALIC, 12));
       setForeground(UIConstants.TEXT_COLOR);

    }
    public MyLabel(String lbName) {
        super(lbName);

       setFont(new Font("Times New Roman", Font.ITALIC, 12));
       setForeground(UIConstants.TEXT_COLOR);

    }

}
