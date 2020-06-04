package application;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdminDashboard extends JFrame implements ActionListener{
        
   JButton btnqstn,btnstudents, btnback;
    
public AdminDashboard(){
     Container c = getContentPane();
        c.setBackground(Color.GRAY);
        
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,800);
        setTitle("Welcome to Admin Dashboard");
        setVisible(true);
        setLocationRelativeTo(null);
        
       setLayout(null);
       
       //button to create questions by admin
       btnqstn=new JButton("Create Questions");
       btnqstn.setBounds(300,230,270,45);
       add(btnqstn);
       btnqstn.addActionListener(this);
          btnqstn.setForeground(Color.WHITE);
      btnqstn.setFont(new Font("Arial",Font.BOLD,16));
      btnqstn.setBackground(Color.BLACK);
       
       btnstudents=new JButton("View Registered Students"); //for viewing students who have registered for exam
      btnstudents.setBounds(300, 380, 270, 45);
       add(btnstudents);
       btnstudents.addActionListener(this);
          btnstudents.setForeground(Color.WHITE);
      btnstudents.setFont(new Font("Arial",Font.BOLD,16));
      btnstudents.setBackground(Color.BLACK);
      
             btnback=new JButton("Log Out");
       btnback.setBounds(730, 0, 150, 30);
       add(btnback);
       btnback.addActionListener(this);
        btnback.setForeground(Color.WHITE);
        btnback.setFont(new Font("Calibri",Font.PLAIN,20));
      btnback.setBackground(Color.BLACK);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(ae.getSource().equals(btnqstn)){     
        new Questions(); 
        this.dispose();
    }
        if(ae.getSource().equals(btnback)){ 
            int a = JOptionPane.showConfirmDialog(null,"Do you sure want to log out?","Log Out",JOptionPane.YES_NO_OPTION);
            if(a==0){
        new NewClass(); 
        this.dispose();
            }
    }
        if(ae.getSource().equals(btnstudents)){     
         new RegistrationTable(); 
        this.dispose();
    }
}
}