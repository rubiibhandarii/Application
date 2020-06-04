
package application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class NewClass extends JFrame implements ActionListener {
    JLabel label,label2, bg;
    JTextField tfield;
    JPasswordField tfield2;
    JButton buttonLogin, btnback;
        
public NewClass(){
  setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,700);
        setTitle("Admin Login Form");
       setLayout(null);
       setLocationRelativeTo(null);
       
       buttonLogin=new JButton("Login");
      buttonLogin.setBounds(385, 320, 160, 45);
       add(buttonLogin);
       buttonLogin.addActionListener(this);
        buttonLogin.setForeground(Color.WHITE);
      buttonLogin.setFont(new Font("Arial",Font.BOLD,19));
      buttonLogin.setBackground(Color.GRAY);
      
       btnback=new JButton("Back");
       btnback.setBounds(0, 0, 130, 30);
       add(btnback);
       btnback.addActionListener(this);
        btnback.setForeground(Color.WHITE);
        btnback.setFont(new Font("Calibri",Font.PLAIN,19));
      btnback.setBackground(Color.BLACK);
   
       
        tfield=new JTextField();
       tfield.setBounds(360,130,200,40);
       add(tfield);
      
       
       tfield2=new JPasswordField();
        tfield2.setBounds(360,210,200,40);      
       add(tfield2);
       
       label=new JLabel("Admin Email");
       label.setBounds(240,130,150,30);
       add(label);
       label.setFont(new Font("Arial",Font.BOLD,18));
       
       label2=new JLabel("Password");
       label2.setBounds(240,210,150,30);
       add(label2);
       label2.setFont(new Font("Arial",Font.BOLD,18));
       
             ImageIcon img = new ImageIcon("images/wb.jpg");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,900,700);
        add(bg);
         setResizable(false);
 
       
       setVisible(true);
          
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     if(ae.getSource().equals(buttonLogin)){
         
         
         if(tfield.getText().equals("admin") && tfield2.getText().equals("admin") ){
       
        new AdminDashboard();
         this.dispose();
         }
         
         else if (tfield.getText().trim().equals("") || tfield2.getText().trim().equals("")){       
           JOptionPane.showMessageDialog(null,"Field is left blank!");
         }
         else{
               JOptionPane.showMessageDialog(null,"Email or password is incorrect!");
         }
    }
     if (ae.getSource().equals(btnback)){
           
                new Application();
                this.dispose();
               }
    
}
}
