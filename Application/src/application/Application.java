
package application;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Application extends JFrame implements ActionListener {

	JButton btnAdmin, btnExaminee, btnlogin;
        JLabel bg;
    
    
public Application(){
    
     setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,700);
        setTitle("Main Form");
       setLayout(null);
       setLocationRelativeTo(null);
       
        
       btnAdmin=new JButton("Admin Login"); //login for admin
      btnAdmin.setBounds(350, 180, 250, 38);
       add(btnAdmin);
       btnAdmin.addActionListener(this);
      btnAdmin.setForeground(Color.WHITE);
      btnAdmin.setFont(new Font("Arial",Font.BOLD,18));
      btnAdmin.setBackground(Color.GRAY);
      
       
       btnExaminee=new JButton("Examinee Signup"); //signup for student
      btnExaminee.setBounds(350, 285, 250, 38);
       add(btnExaminee);
      btnExaminee.addActionListener(this);
        btnExaminee.setForeground(Color.WHITE);
        btnExaminee.setFont(new Font("Arial",Font.BOLD,18));
      btnExaminee.setBackground(Color.BLACK);
       
       btnlogin=new JButton("Examinee Login"); //login for student
      btnlogin.setBounds(350, 385, 250, 38);
       add(btnlogin);
      btnlogin.addActionListener(this);
        btnlogin.setForeground(Color.WHITE);
        btnlogin.setFont(new Font("Arial",Font.BOLD,18));
      btnlogin.setBackground(Color.BLACK);

       ImageIcon img = new ImageIcon("images/wb.jpg");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,900,700);
        add(bg);
         setResizable(false);    
       setVisible(true);
          
 }
    public static void main(String[] args) {
        // TODO code application logic here
         new Application().setVisible(true);
         
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(ae.getSource().equals(btnAdmin)){
       
        new NewClass();
        this.dispose();
      
      }
    if(ae.getSource().equals(btnExaminee)){
        new NewExamineeClass();
        this.dispose();
    }
    if(ae.getSource().equals(btnlogin)){
        new ExamineeLogin();
        this.dispose();
    }
    }
    
}
