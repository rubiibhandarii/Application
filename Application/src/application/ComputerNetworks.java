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
import javax.swing.*;


public class ComputerNetworks extends JFrame implements ActionListener {
  JLabel label3,label1,label2, label4, label5, label6,lblQ,lblQn;
    JTextField tfield3, tfield1, tfield2, tfield4, tfield5, tfield6;
	JButton btndone;
        
        int i=1;
        int total=1;
    
    
public ComputerNetworks(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setTitle("Computer Network Questions");
        setVisible(true);
        
       setLayout(null);
       setLocationRelativeTo(null);
       
       
       lblQ=new JLabel("Question No.");
       lblQ.setFont(new Font("SansSerif",Font.BOLD,20));
       lblQ.setForeground(Color.BLACK);
       lblQ.setBounds(300,550,180,30);
       add(lblQ);
       
       lblQn=new JLabel("1 of 10");
       lblQn.setFont(new Font("SansSerif",Font.BOLD,20));
       lblQn.setForeground(Color.BLACK);
        lblQn.setBounds(430,550,180,30);
       add(lblQn);
       
      
   
          tfield3=new JTextField();
        tfield3.setBounds(250,100,400,30);      
       add(tfield3);
       
       tfield1=new JTextField();
        tfield1.setBounds(250,150,400,30);      
       add(tfield1);
       
       tfield2=new JTextField();
        tfield2.setBounds(250,200,400,30);      
       add(tfield2);
        
       tfield4=new JTextField();
       tfield4.setBounds(250,250,400,30);
       add(tfield4);
    
       tfield5=new JTextField();
       tfield5.setBounds(250,300,400,30);
       add(tfield5);
       
        tfield6=new JTextField();
       tfield6.setBounds(250,350,400,30);
       add(tfield6);
       
          label3=new JLabel("Questions");
       label3.setBounds(110,100,150,30);
       add(label3);
        label3.setFont(new Font("Arial",Font.BOLD,18));
       
       label1=new JLabel("Answer 1");
       label1.setBounds(110,150,150,30);
       add(label1);
        label1.setFont(new Font("Arial",Font.BOLD,18));
       
       label2=new JLabel("Answer 2");
       label2.setBounds(110,200,150,30);
       add(label2);
        label2.setFont(new Font("Arial",Font.BOLD,18));
          
       label4=new JLabel("Answer 3");
       label4.setBounds(110,250,150,30);
       add(label4);
        label4.setFont(new Font("Arial",Font.BOLD,18));
       
         label5=new JLabel("Answer 4");
       label5.setBounds(110,300,150,30);
       add(label5);
        label5.setFont(new Font("Arial",Font.BOLD,18));
       
         label6=new JLabel("CorrectAnswer");
       label6.setBounds(110,350,150,30);
       add(label6);
        label6.setFont(new Font("Arial",Font.BOLD,18));
        
         btndone=new JButton("Done");
      btndone.setBounds(340, 450, 150, 30);
       add(btndone);
       btndone.addActionListener(this);
          btndone.setForeground(Color.WHITE);
      btndone.setFont(new Font("Arial",Font.BOLD,18));
      btndone.setBackground(Color.GRAY);
       
   
    
}
    @Override
    public void actionPerformed(ActionEvent ae) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     if(ae.getSource()==btndone)
        {
            if (tfield3.getText().trim().equals("") || tfield1.getText().trim().equals("") || tfield2.getText().trim().equals("") || tfield4.getText().trim().equals("")|| tfield5.getText().trim().equals("")|| tfield6.getText().trim().equals("") ){       
           JOptionPane.showMessageDialog(null,"Field is left blank!");
         }
            else if( !tfield1.getText().trim().equals(tfield6.getText().trim()) && !tfield2.getText().trim().equals(tfield6.getText().trim()) && !tfield4.getText().trim().equals(tfield6.getText().trim()) && !tfield5.getText().equals(tfield6.getText().trim()) ){
             JOptionPane.showMessageDialog(null,"Atleast one answer should be right");
             //right answer should match with the answer in one textfield
         }
            else{
            
            try {
                database data=new database();
                int ans=data.computerNetworkQstn(tfield3.getText(),tfield1.getText(),tfield2.getText(),tfield4.getText(),tfield5.getText(),tfield6.getText());

                
                if(ans>0)
                {
                    JOptionPane.showMessageDialog(null,"Data has been saved");
                    
                    
                    total +=i;
                      lblQn.setText(Integer.toString(total)+" of 10");
                      tfield1.setText("");
                      
                      
                    tfield2.setText("");
                    tfield3.setText("");
                    tfield4.setText("");
                    tfield5.setText("");
                    tfield6.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Data cannot be saved");
                }
            } catch (Exception e) {
            }
            }
        }
     
      
      if (lblQn.getText().equals((Integer.toString(11)+" of 10"))){
              new Questions();
              this.dispose();
          }
    }
    
}
