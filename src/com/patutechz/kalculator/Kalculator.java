package com.patutechz.kalculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
public class Kalculator extends JFrame{
    JButton cls=new JButton("C"); 
    JLabel bck=new JLabel(""); 
    JLabel lbl=new JLabel(""); 
    JButton close=new JButton("EXIT");
    JButton button0=new JButton("0"); 
    JButton button1=new JButton("1"); 
    JButton button2=new JButton("2"); 
    JButton button3=new JButton("3"); 
    JButton button4=new JButton("4"); 
    JButton button5=new JButton("5"); 
    JButton button6=new JButton("6"); 
    JButton button7=new JButton("7"); 
    JButton button8=new JButton("8"); 
    JButton button9=new JButton("9"); 
    JButton buttonPoint=new JButton("."); 
    JButton buttonEqual=new JButton("="); 
    JButton buttonPlus=new JButton("+"); 
    JButton buttonMinus=new JButton("-"); 
    JButton buttonDivide=new JButton("/"); 
    JButton buttonMultiply=new JButton("*"); 
    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);
    JMenuBar bar = new JMenuBar();
    JMenu edit = new JMenu("Edit");
    JMenu view = new JMenu("View");
    JMenu help = new JMenu("Help");
    JMenuItem exit= new JMenuItem("Exit");
    JMenuItem help_cal = new JMenuItem("View Help");
    JMenuItem about= new JMenuItem("About Calculator");
    public Kalculator(){
        
        close.setFont(new Font("Serif", Font.BOLD, 15));
        close.setBackground(Color.black);
        close.setForeground(Color.WHITE);
        
        cls.setFont(new Font("Serif", Font.BOLD, 20));
        cls.setBackground(Color.black);
        cls.setForeground(Color.WHITE);
        
        buttonPoint.setFont(new Font("Serif", Font.BOLD, 30));
        buttonPoint.setBackground(Color.black);
        buttonPoint.setForeground(Color.WHITE);
        
        buttonEqual.setFont(new Font("Serif", Font.BOLD, 30));
        buttonEqual.setBackground(Color.black);
        buttonEqual.setForeground(Color.WHITE);
        
        buttonPlus.setFont(new Font("Serif", Font.BOLD, 30));
        buttonPlus.setBackground(Color.black);
        buttonPlus.setForeground(Color.WHITE);
        
        buttonMinus.setFont(new Font("Serif", Font.BOLD, 30));
        buttonMinus.setBackground(Color.black);
        buttonMinus.setForeground(Color.WHITE);
        
        buttonDivide.setFont(new Font("Serif", Font.BOLD, 30));
        buttonDivide.setBackground(Color.black);
        buttonDivide.setForeground(Color.WHITE);
        
        buttonMultiply.setFont(new Font("Serif", Font.BOLD, 30));
        buttonMultiply.setBackground(Color.black);
        buttonMultiply.setForeground(Color.WHITE);
        
        button0.setFont(new Font("Serif", Font.PLAIN, 20));
        button0.setBackground(Color.black);
        button0.setForeground(Color.WHITE);
        
        button1.setFont(new Font("Serif", Font.PLAIN, 20));
        button1.setBackground(Color.black);
        button1.setForeground(Color.WHITE);
        
        button2.setFont(new Font("Serif", Font.PLAIN, 20));
        button2.setBackground(Color.black);
        button2.setForeground(Color.WHITE);
        
        button3.setFont(new Font("Serif", Font.PLAIN, 20));
        button3.setBackground(Color.black);
        button3.setForeground(Color.WHITE);
        
        button4.setFont(new Font("Serif", Font.PLAIN, 20));
        button4.setBackground(Color.black);
        button4.setForeground(Color.WHITE);
        
        button5.setFont(new Font("Serif", Font.PLAIN, 20));
        button5.setBackground(Color.black);
        button5.setForeground(Color.WHITE);
        
        button6.setFont(new Font("Serif", Font.PLAIN, 20));
        button6.setBackground(Color.black);
        button6.setForeground(Color.WHITE);
        
        button7.setFont(new Font("Serif", Font.PLAIN, 20));
        button7.setBackground(Color.black);
        button7.setForeground(Color.WHITE);
        
        button8.setFont(new Font("Serif", Font.PLAIN, 20));
        button8.setBackground(Color.black);
        button8.setForeground(Color.WHITE);
        
        button9.setFont(new Font("Serif", Font.PLAIN, 20));
        button9.setBackground(Color.black);
        button9.setForeground(Color.WHITE);
        
        displayField.setSize(350, 300);
        displayField.setBackground(Color.DARK_GRAY);
        displayField.setForeground(Color.WHITE);
        displayField.setFont(new Font("Serif", Font.PLAIN, 30));
        displayField.setAlignmentX(0.5f);
        displayField.setEditable(false);
        setTitle("Kalculator by Patutechz");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        panel.setFont(new Font("Serif", Font.BOLD, 50));
        panel.setAlignmentX(0.5f);
        
        panel.add(cls);
        panel.add(bck);
        panel.add(lbl);
        panel.add(close);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMinus);
        panel.add(button0);
        panel.add(buttonPoint);
        panel.add(buttonEqual);
        panel.add(buttonPlus);
        panel.setBackground(Color.DARK_GRAY);
        
        
        
        
        about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AboutDialog ad = new AboutDialog();
                ad.setVisible(true);
            }
        });
        
        cls.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayField.setText("");
                
            }
        });
        
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        
        windowContent.setLayout(new BorderLayout());
        windowContent.setFont(new Font("Serif", Font.BOLD, 20));
        windowContent.setAlignmentX(0.5f);
        windowContent.add(panel,BorderLayout.CENTER);
        windowContent.add(displayField , BorderLayout.NORTH);
        add(windowContent);
        
        view.add(exit);
        help.add(help_cal);
        help.add(about);
       
        bar.add(view);
        bar.add(edit);
        bar.add(help);
        
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(bar);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        KalculatorEngine calcEngine = new KalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);

    }
    public static void main(String[] args) {
        try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                
            }
        catch (Exception e) {
                System.out.println("Error:" + e.getStackTrace());
            }
                new Kalculator();  
    }
    
}
