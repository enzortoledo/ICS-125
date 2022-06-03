/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics.pkg125.gui;
;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author C0505800
 */
public class ICS125GUI {
 JPanel p;
 JFrame f;
 JButton b;
 JLabel label;
 JLabel label2;
 JTextField text;
 JTextField ics;
 JTextField result;
 
 public ICS125GUI(){
         label2 = new JLabel();
         ics = new JTextField("127");
         text = new JTextField("128");
         f = new JFrame("Basic Test!");
         p = new JPanel();
         b = new JButton("Click me");
         label = new JLabel("Hello word");
         p.add(label);
         p.add(label2);
         b.addActionListener(new ButtonListener());
         p.add(text);
         p.add(ics);
         result = new JTextField("");
         p.add(result);
         
        p.add(b);
        f.getContentPane().add(p);
        
    //quit Java after closing the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200); //set size in pixels
        f.setVisible(true); //show the window
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(args[0]);
        System.out.println(args[1]);
        
        ICS125GUI gui;
        gui = new ICS125GUI();



        
    }

   

    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String newText = ics.getText();
            String textField = text.getText();
            int number = Integer.parseInt(textField);
            int number2 = Integer.parseInt(newText);
            label.setText("The new listener" + number);
            int sum = number + number2;
            label2.setText("The sum of these numbers is " + sum);
        }
        
    }
    
}
