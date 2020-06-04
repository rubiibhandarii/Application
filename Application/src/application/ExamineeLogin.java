
package application;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

public class ExamineeLogin extends JFrame implements ActionListener {
       JLabel label,label2,bg;
    JTextField tfield;
    JPasswordField tfield2;
	JButton buttonLogin, btnSignUp, btnback;

         
public ExamineeLogin(){
    
     Container c = getContentPane();
        
     setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(950,800);
        setTitle("Student Login Form");
        setVisible(true);
       setLayout(null);
       setLocationRelativeTo(null);
       
       buttonLogin=new JButton("Login");
      buttonLogin.setBounds(290, 460, 150, 37);
       add(buttonLogin);
       buttonLogin.addActionListener(this);
           buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setFont(new Font("Calibri",Font.BOLD,22));
      buttonLogin.setBackground(Color.BLACK);
   
       
        tfield=new JTextField();
       tfield.setBounds(400,250,180,35);
       add(tfield);
      
       
       tfield2=new JPasswordField();
        tfield2.setBounds(400,330,180,35);      
       add(tfield2);
       
       label=new JLabel("Email");
       label.setBounds(283,250,150,30);
       add(label);
       label.setFont(new Font("Calibri",Font.BOLD,24));
       label.setForeground(Color.darkGray);
       
       label2=new JLabel("Password");
       label2.setBounds(280,330,150,30); //token from signup form is the password
       add(label2);
       label2.setFont(new Font("Calibri",Font.BOLD,24));
       label2.setForeground(Color.DARK_GRAY);
       
       btnSignUp=new JButton("<html><u>Sign Up</u></html>");
       btnSignUp.setFont(new Font("Arial",Font.BOLD,23));
       btnSignUp.setBounds(430, 460, 150, 30);    
       Border emptyBorder = BorderFactory.createEmptyBorder();
       btnSignUp.setBorder(emptyBorder);
       btnSignUp.setContentAreaFilled(false);
       btnSignUp.setForeground(Color.WHITE);
       btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       c.add(btnSignUp); 
       btnSignUp.addActionListener(this);
       
           btnback=new JButton("Back");
       btnback.setBounds(0, 0, 150, 30);
       add(btnback);
       btnback.addActionListener(this);
        btnback.setForeground(Color.white);
        btnback.setFont(new Font("Calibri",Font.PLAIN,21));
      btnback.setBackground(Color.DARK_GRAY); 
      
         ImageIcon img = new ImageIcon("images/bg.jfif");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,950,800);
        add(bg);
      setResizable(false);
      
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
      if(ae.getSource().equals(btnSignUp)){
        new NewExamineeClass();
    }
       if (ae.getSource().equals(btnback)){
           
                new Application();
                this.dispose();
               }
      
      if(ae.getSource().equals(buttonLogin)){
           
            if (tfield.getText().trim().equals("") || tfield2.getText().equals("")  ){       
           JOptionPane.showMessageDialog(null,"Please fill the blank fields");
         }
            else{
           try{
           database db = new database();
           Statement st = db.conn.createStatement();
           String query="select Password from examinee_signup where Email ='"+tfield.getText()+"'";
           ResultSet rs=st.executeQuery(query);
           String get_password="";
           while (rs.next()){
               get_password=rs.getString(1);
           }
           if(get_password.equals(tfield2.getText())){
               JOptionPane.showMessageDialog(null,"You have logged in successfully. Good Luck!");
               new AttemptExam();
               this.dispose();
           }
           else{
               JOptionPane.showMessageDialog(null,"Incorrect Email/Password");
           }
           }
           catch(Exception ex){}
       }
       }
    }
    }

