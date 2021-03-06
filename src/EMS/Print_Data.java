package EMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

 

class Print_Data implements ActionListener{
    JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab;
    String emp_id,name,supervisor,address,phone,email,education,post,age,dob,cnic;
    JButton b1,b2;
    ImageIcon icon;

    Print_Data(String e_id){
        try{
            conn con = new conn();                                              // Connect to database
            String str = "select * from employee where emp_id = '"+e_id+"'";    // Display all columns from DB, based on id searched
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){

                // Employee info to display
                name = rs.getString("name");
                supervisor = rs.getString("supervisor");
                age = rs.getString("age");
                dob = rs.getString("dob");
                address = rs.getString("address");
                phone = rs.getString("phone");
                email = rs.getString("email");
                education = rs.getString("education");
                post = rs.getString("post");
                cnic = rs.getString("cnic");
                emp_id = rs.getString("emp_id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
 
        // Create base frame and title
        f=new JFrame("Pearson Specter Litt - Print Employee Data");
        f.setVisible(true);
        f.setSize(595,642);
        f.setLocation(450,200);
        f.setBackground(Color.white);
        f.setLayout(null);


        id9=new JLabel();
        id9.setBounds(0,0,595,642);
        id9.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("EMS/images/print.jpg")); // add background image from local file
        id9.setIcon(img);

        // Display labels
        id8 = new JLabel("Employee Details");
        id8.setBounds(50,10,250,30);
        f.add(id8);
        id8.setFont(new Font("serif",Font.BOLD,25));
        id8.setForeground(Color.white);
        id9.add(id8);
        f.add(id9);

        id = new JLabel("Employee Id:");
        id.setBounds(50,70,120,30);
        id.setFont(new Font("serif",Font.BOLD,20));
        id.setForeground(Color.white);
        id9.add(id);

        aid = new JLabel(emp_id);
        aid.setBounds(200,70,200,30);
        aid.setFont(new Font("serif",Font.BOLD,20));
        aid.setForeground(Color.white);
        id9.add(aid);

        id1 = new JLabel("Name:");
        id1.setBounds(50,120,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setForeground(Color.white);
        id9.add(id1);

        aid1 = new JLabel(name);
        aid1.setBounds(200,120,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        aid1.setForeground(Color.white);
        id9.add(aid1);

  
        id2 = new JLabel("Supervisor:"); 
        id2.setBounds(50,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setForeground(Color.white);
        id9.add(id2);

        aid2 = new JLabel(supervisor);
        aid2.setBounds(200,170,300,30);
        aid2.setFont(new Font("serif",Font.BOLD,20));
        aid2.setForeground(Color.white);
        id9.add(aid2);

        id3= new JLabel("Address:");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id3.setForeground(Color.white);
        id9.add(id3);

        aid3= new JLabel(address);
        aid3.setBounds(200,220,300,30);
        aid3.setFont(new Font("serif",Font.BOLD,20));
        aid3.setForeground(Color.white);
        id9.add(aid3);


        id4= new JLabel("Mobile No:");  
        id4.setBounds(50,270,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id4.setForeground(Color.white);
        id9.add(id4);

        aid4= new JLabel(phone);
        aid4.setBounds(200,270,300,30); 
        aid4.setFont(new Font("serif",Font.BOLD,20));
        aid4.setForeground(Color.white);
        id9.add(aid4);

        
        id5= new JLabel("E-mail:");
        id5.setBounds(50,320,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id5.setForeground(Color.white);
        id9.add(id5);

        aid5= new JLabel(email);
        aid5.setBounds(200,320,300,30);
        aid5.setFont(new Font("serif",Font.BOLD,20));
        aid5.setForeground(Color.white);
        id9.add(aid5);

        
        id6= new JLabel("Education:");
        id6.setBounds(50,370,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id6.setForeground(Color.white);
        id9.add(id6);

        aid6= new JLabel(education);
        aid6.setBounds(200,370,300,30); 
        aid6.setFont(new Font("serif",Font.BOLD,20));
        aid6.setForeground(Color.white);
        id9.add(aid6);


        id7= new JLabel("Job Post:");
        id7.setBounds(50,420,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id7.setForeground(Color.white);
        id9.add(id7);

        aid7= new JLabel(post);
        aid7.setBounds(200,420,300,30);
        aid7.setFont(new Font("serif",Font.BOLD,20));
        aid7.setForeground(Color.white);
        id9.add(aid7);

        // Create and place buttons
        b1=new JButton("Done");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,520,120,30);
        b1.addActionListener(this);
        id9.add(b1);

        b2=new JButton("New Search");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,520,120,30);
        b2.addActionListener(this);
        id9.add(b2);


    }
    
    // Listen for user to perform action
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){                                   // Go back to main screen (logged-in)
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b2){                                  // Go back to employee search
            f.setVisible(false);
            new View_Employee();
        }
    }
    public static void main(String[] args){                     // Default call for print data screen
        new Print_Data("Print Data");
    }

}