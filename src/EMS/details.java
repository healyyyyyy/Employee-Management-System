package EMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4, b5; 

    details(){
        f=new JFrame("Pearson Specter Litt - Employee Details");
        f.setBackground(Color.white);
        f.setLayout(null);

        // Create frame
        l1 = new JLabel();
        l1.setBounds(0,0,700,500);                      // Adjust position (distance x, distance y, width, height)     
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("EMS/images/details.jpg")); // Background image
        l1.setIcon(i1);
        f.add(l1);

       
        // Create buttons
        b1=new JButton("Add");
        b1.setBounds(20,350,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);;

        b2=new JButton("View");
        b2.setBounds(150,350,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(20,400,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(150,400,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        l1.add(b4);
        
        b5=new JButton("Log-out");
        b5.setBounds(570,400,100,40);
        b5.setFont(new Font("serif",Font.BOLD,15));
        b5.addActionListener(this);
        l1.add(b5);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);

    }
    
    // Listen for user to perform action
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){                         // Open new employee frame
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){                         // Open current employee record frame (search-based)
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){                         // Open employee removal frame (search-based)
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){                         // Open search employee frame
            f.setVisible(false);
            new Search_Employee();
        }
        
        if(ae.getSource()==b5){                         // Return to log-in screen
            f.setVisible(false);
            new login();
        }
    }

    public static void main(String[ ] arg){             // Default frame after log-in
        details d = new details();
    }
}
