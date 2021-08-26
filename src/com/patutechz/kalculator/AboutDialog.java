package com.patutechz.kalculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AboutDialog extends JDialog{
    public AboutDialog() {
        setTitle("About Kalculator");
        setLayout(new BorderLayout());
        ImageIcon icon = new ImageIcon("patutechz.png");
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        
        
        JTextField tf = new JTextField("Kalculator Version 1.0" + " \n Created by Patutechz");
        tf.setFont(new Font("Serif", Font.BOLD, 13));
        tf.setAlignmentX(0.5f);
        tf.setEditable(false);
        
        
        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });
        close.setAlignmentX(0.5f);
        add(label , BorderLayout.NORTH);
        add(tf , BorderLayout.CENTER);
        add(close, BorderLayout.SOUTH);
        setModalityType(ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);        
    }

}
