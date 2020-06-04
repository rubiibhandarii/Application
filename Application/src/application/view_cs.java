package application;
import application.GetQuestion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class view_cs extends JFrame implements ActionListener{
    
    JLabel Question[] = new JLabel[10];
    JRadioButton[] opt1 = new JRadioButton[10];
    JRadioButton[] opt2 = new JRadioButton[10];
    JRadioButton[] opt3 = new JRadioButton[10];
    JRadioButton[] opt4 = new JRadioButton[10];
    JPanel RootQuestionPane;
    ButtonGroup[] group= new ButtonGroup[10];
    String[] userAns = new String[10];
    int marks = 0;
     ArrayList<GetQuestion> qna = new ArrayList<GetQuestion>();
        database dc = new database();
    
    
    JButton Next;
    JButton Previous;
    JButton Finish;
    int counter=-1;
    private JPanel[] QuestionPane;
    private JLabel[] Questions;
    private ButtonGroup[] BtnGrp;
    private JRadioButton[] option1;
    private JRadioButton[] option2;
    private JRadioButton[] option3;
    private JRadioButton[] option4;
    private JPanel btnPane;
    private final JPanel questionPane;
    
    
    public view_cs() throws SQLException{
        
        
        setVisible(true);
    setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container J = getContentPane();
        J.setLayout(null);
        setLocationRelativeTo(null);
        
        
       
        RootQuestionPane = new JPanel();
        RootQuestionPane.setBounds(0,0,800,800);
        RootQuestionPane.setLayout(null);
        RootQuestionPane.setBackground(Color.BLACK);
        add(RootQuestionPane);
        
         questionPane = new JPanel();
        questionPane.setBounds(0,0,800,500);
        questionPane.setLayout(null);
        questionPane.setBackground(Color.BLACK);
        RootQuestionPane.add(questionPane);
        
     
        Next= new JButton("Next");
        Next.setBounds(500,300,110,35);
        Next.setBackground(Color.LIGHT_GRAY);
        Next.setFont(new Font("SansSerif", Font.BOLD, 17));
        Next.addActionListener(this);
        
         btnPane = new JPanel();
        btnPane.setBounds(0,350,650,450);
        btnPane.setBackground(Color.BLACK);
        btnPane.setLayout(null);
        btnPane.add(Next);
        
        RootQuestionPane.add(btnPane);
        
        Previous= new JButton("Previous");
        Previous.setBounds(200,300,110,35);
       Previous.setBackground(Color.LIGHT_GRAY);
      Previous.addActionListener(this);
      Previous.setFont(new Font("SansSerif", Font.BOLD, 17));
      btnPane.add(Previous);
       Previous.setVisible(false);
      
      Finish= new JButton("Finish");
        Finish.setBounds(500,300,110,35);
        Finish.setBackground(Color.LIGHT_GRAY);
        Finish.setFont(new Font("SansSerif", Font.BOLD, 17));
        Finish.setVisible(false);
        Finish.addActionListener(this);
        btnPane.add(Finish);
        
        qna =dc.ComputerSystem();
        Collections.shuffle(qna);
        dynamicQpanels(qna);
    }
   

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next) {
            try{
            counter=counter+1;
            if (option1[counter].isSelected() || option2[counter].isSelected() || option3[counter].isSelected()|| option4[counter].isSelected()) {
                // group[counter].getSelection().getActionCommand();
                userAns[counter] = BtnGrp[counter].getSelection().getActionCommand();
                 if (userAns[counter].equals(qna.get(counter).correctAnswer())) {
                     
                marks = marks + 1;
            }
                
            }
            else{
                userAns[counter] = null;
            }
           
            
            if (counter==8) {
                Next.setVisible(false);
                Finish.setVisible(true);
            }
            
            if(counter == 0){
                Previous.setVisible(true);
            }
            
            
            panelSwitch(counter);
            }
            catch(Exception ex){}
        }
        if (e.getSource() == Previous) {
            try{
            counter=counter-1;
            if (counter <= -1){
                Previous.setVisible(false);
            }
            panelSwitch(counter);
            if (option1[counter].isSelected() || option2[counter].isSelected() || option3[counter].isSelected()|| option4[counter].isSelected()) {
                // group[counter].getSelection().getActionCommand();
                userAns[counter] = BtnGrp[counter].getSelection().getActionCommand();
                
            }
            else{
                userAns[counter] = null;
            }
            
            if (counter==7) {
                Next.setVisible(true);
                Finish.setVisible(false);
            }
            }
            catch(Exception ex){}
        }
        if (e.getSource().equals(Finish)) {
            if (option1[counter].isSelected() || option2[counter].isSelected() || option3[counter].isSelected()|| option4[counter].isSelected()) {
                // group[counter].getSelection().getActionCommand();
                userAns[counter] = BtnGrp[counter].getSelection().getActionCommand();
                 if (userAns[counter].equals(qna.get(counter).correctAnswer())) {
                     
                marks = marks + 1;
            }
                
            }
            if (marks < 4){
            JOptionPane.showMessageDialog(null, "You have failed the test with " + marks+" marks.");
             new AttemptExam();
            this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "You have passed the test with " + marks+" marks.");
             new AttemptExam();
            this.dispose();
            }
        }
        }
    public void dynamicQpanels(ArrayList<GetQuestion> listOfQuestion) {
	
	QuestionPane = new JPanel[10];
	Questions = new JLabel[10];
	BtnGrp = new ButtonGroup[10];
	option1 = new JRadioButton[10];
	option2 = new JRadioButton[10];
	option3 = new JRadioButton[10];
	option4 = new JRadioButton[10];
	
	
	for (int i = 0; i < 10; i++) {
		QuestionPane[i] = new JPanel();
		QuestionPane[i].setBounds(0, 0, 700, 400);
		QuestionPane[i].setLayout(null);
                QuestionPane[i].setBackground(Color.BLACK);
		questionPane.add(QuestionPane[0]);
		
		
		
		Questions[i] = new JLabel("<html>Q"+(i+1)+".   "+listOfQuestion.get(i).getQuestion()+"</html>");//retriving questions
		Questions[i].setFont(new Font("SansSerif", Font.BOLD, 20));
		Questions[i].setBounds(60, 100, 700, 50);
                Questions[i].setBackground(Color.BLACK);
                Questions[i].setForeground(Color.WHITE);
		QuestionPane[i].add(Questions[i]);
		
		BtnGrp[i]= new ButtonGroup();
		
		option1[i] = new JRadioButton("<html>"+qna.get(i).getOption1()+"</html>");
		option1[i].setBounds(60, 170, 670, 45);
                option1[i].setBackground(Color.BLACK);
                option1[i].setForeground(Color.WHITE);
		option1[i].setFont(new Font("SansSerif", Font.PLAIN, 16));
		option1[i].setActionCommand(qna.get(i).getOption1());
		BtnGrp[i].add(option1[i]);
		QuestionPane[i].add(option1[i]);
		
		option2[i] = new JRadioButton("<html>"+qna.get(i).getOption2()+"</html>");
		option2[i].setBounds(60, 209, 670, 45);
                option2[i].setBackground(Color.BLACK);
                option2[i].setForeground(Color.WHITE);
		option2[i].setFont(new Font("SansSerif", Font.PLAIN, 16));
		option2[i].setActionCommand(listOfQuestion.get(i).getOption2());
		BtnGrp[i].add(option2[i]);
		QuestionPane[i].add(option2[i]);
		
		option3[i] = new JRadioButton("<html>"+qna.get(i).getOption3()+"</html>");
		option3[i].setBounds(60, 248, 670, 45);
                option3[i].setBackground(Color.BLACK);
                option3[i].setForeground(Color.WHITE);
		option3[i].setFont(new Font("SansSerif", Font.PLAIN, 16));
		option3[i].setActionCommand(listOfQuestion.get(i).getOption3());
		BtnGrp[i].add(option3[i]);
		QuestionPane[i].add(option3[i]);
		
		option4[i] = new JRadioButton("<html>"+qna.get(i).getOption4()+"</html>");
		option4[i].setBounds(60, 287, 670, 45);
                option4[i].setForeground(Color.WHITE);
                option4[i].setBackground(Color.BLACK);
		option4[i].setFont(new Font("SansSerif", Font.PLAIN, 16));
		option4[i].setActionCommand(qna.get(i).getOption4());
		BtnGrp[i].add(option4[i]);
		QuestionPane[i].add(option4[i]);
		
	}

	
}
    public void panelSwitch(int counter){
       questionPane.removeAll();
       questionPane.add(QuestionPane[counter+1]);
       questionPane.repaint();
       questionPane.revalidate();
}
}
    

    

  
    

