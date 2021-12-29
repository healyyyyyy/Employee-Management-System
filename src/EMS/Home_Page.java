package EMS;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Home_page implements ActionListener{
    JFrame f; 
    JLabel id;
    JLabel l1;
    JButton b;
    JButton b2;

    Home_page(){
 
        // create base frame title
        f=new JFrame("Pearson Specter Litt - EMS");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        // Apply local image as background
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("EMS/images/home.jpg"));
        JLabel l1 = new JLabel(i1);
        
        // Adjust position (distance x, distance y, width, height)
        l1.setBounds(0,0,938,501);
        f.add(l1);

        // Create buttons for user
        b = new JButton("Access System");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b2 = new JButton("Exit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        // Place buttons and adjust position
        b.setBounds(320,380,150,50);
        b.addActionListener(this);
        
        b2.setBounds(480,380,150,50);
        b2.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,900,501);
        id.setLayout(null);
        

        id.add(b);
        id.add(b2);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(938,501);
        f.setLocation(200,100);

        

    }
    // Listen for user to perform action
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){                      // Disable home screen and advance to login
            f.setVisible(false);
            new login();    
        }
        
        if(ae.getSource()==b2){                     // Exit app
            f.setVisible(false);
        }
    }

    public static void main(String[] arg){          // Default launch screen
        Home_page f = new Home_page();
    }
}