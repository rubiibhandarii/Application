
package application;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Questions extends JFrame implements ActionListener {

    JComboBox subjects;
    JLabel label, bg;
    JButton select,btnback;
    
public Questions(){
           setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setTitle("Create Subject Questions"); 
        setVisible(true);
         setLocationRelativeTo(null);
        
       setLayout(null);
       label=new JLabel("Select a subject:"); //selecting any subject to create questions
       label.setBounds(300,270,250,50);
       label.setFont(new Font("Arial",Font.BOLD,19));
       add(label);
       
       subjects=new JComboBox();
       subjects.addItem("Mordern Web");
       subjects.addItem("Computer Networks");
       subjects.addItem("Computer System");
       subjects.addItem("Database");
       subjects.setBounds(300,330,200,50);
       add(subjects);
       subjects.setFont(new Font("Arial",Font.PLAIN,18));
       
       select=new JButton("Done");
       select.setBounds(300, 530, 200, 50);
       add(select);
       select.addActionListener(this);
        select.setForeground(Color.WHITE);
        select.setFont(new Font("Calibri",Font.BOLD,23));
      select.setBackground(Color.BLACK);
      
       btnback=new JButton("Back");
       btnback.setBounds(0, 0, 150, 30);
       add(btnback);
       btnback.addActionListener(this);
        btnback.setForeground(Color.WHITE);
        btnback.setFont(new Font("Calibri",Font.PLAIN,20));
      btnback.setBackground(Color.BLACK);
       
       
           ImageIcon img = new ImageIcon("images/q.jpg");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(0,0,800,800);
        add(bg);
         setResizable(false);
         
}
    @Override
    public void actionPerformed(ActionEvent ae) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(ae.getSource().equals(btnback)){ 
        new AdminDashboard(); 
        this.dispose();
            
    }
        
       if(ae.getSource().equals(select)){     
            if (subjects.getSelectedItem().equals("Mordern Web")){
                int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to overwrite the previous set of modern web questions?","Delete",JOptionPane.YES_NO_OPTION);
            if(a==0){
                database db = new database();
//                db.deleteModernWeb();           
                new MordernWeb();
                 this.dispose();
            }
            }
            else if(subjects.getSelectedItem().equals("Computer Networks")){
                int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to overwrite the previous set of computer system questions?","Delete",JOptionPane.YES_NO_OPTION);
            if(a==0){
                database db = new database();
//                db.deleteComputerNetwork();
                new ComputerNetworks(); 
                this.dispose();
            }
            }
            else if(subjects.getSelectedItem().equals("Computer System")){
                int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to overwrite the previous set of computer system questions?","Delete",JOptionPane.YES_NO_OPTION);
            if(a==0){
                database db = new database();
//                db.deleteComputerSystem();
                new ComputerSystem();
                this.dispose();
            }
            }
            else if(subjects.getSelectedItem().equals("Database")){
                int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to overwrite the set of database questions?","Delete",JOptionPane.YES_NO_OPTION);
            if(a==0){
                database db = new database();
//                db.deleteDatabase();
                new Database_();
                 this.dispose();
            }
            }
           
    }
    }
    
}
