/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class AttemptExam extends JFrame implements ActionListener {

        JComboBox subjects;
    JLabel label, bg;
    JButton select,btnback;
    
public AttemptExam(){
     setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setTitle("Attempt Exam Questions");
        setVisible(true);
        setLocationRelativeTo(null);
        
       setLayout(null);
       label=new JLabel("Select a subject for exam:");
      label.setBounds(300,270,250,50);
       label.setFont(new Font("Arial",Font.BOLD,19));
       add(label);
       
       subjects=new JComboBox(); //choosing test for any one subject
       subjects.addItem("Mordern Web");
       subjects.addItem("Computer Networks");
       subjects.addItem("Computer System");
       subjects.addItem("Database");
       subjects.setBounds(300,330,200,50);
       add(subjects);
       subjects.setFont(new Font("Arial",Font.PLAIN,18));
       
          btnback=new JButton("Log Out");
       btnback.setBounds(620, 0, 150, 30);
       add(btnback);
       btnback.addActionListener(this);
        btnback.setForeground(Color.WHITE);
        btnback.setFont(new Font("Calibri",Font.PLAIN,20));
      btnback.setBackground(Color.BLACK);
       
       select=new JButton("Done");
      select.setBounds(300, 530, 200, 50);
       add(select);
       select.addActionListener(this);
          select.setForeground(Color.WHITE);
        select.setFont(new Font("Calibri",Font.BOLD,23));
      select.setBackground(Color.BLACK);
       
       
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
            int a = JOptionPane.showConfirmDialog(null,"Do you sure want to log out?","Log Out",JOptionPane.YES_NO_OPTION);
            if(a==0){
        new ExamineeLogin(); 
        this.dispose();
            }
    }
       
       
       if(ae.getSource().equals(select)){     
        try{
            if(subjects.getSelectedItem().equals("Computer Networks")){
                new view_cn(); 
                  this.dispose();
            }
            else if (subjects.getSelectedItem().equals("Computer System")){
                new view_cs(); 
                  this.dispose();
            }
            else if (subjects.getSelectedItem().equals("Database")){
                new view_db(); 
                  this.dispose();
            }
                 else if (subjects.getSelectedItem().equals("Mordern Web")){
                new view_mw(); 
                this.dispose();
            }
        }
        catch(Exception ex){}
            
    }
    }
    
}
