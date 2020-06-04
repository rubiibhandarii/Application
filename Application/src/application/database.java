/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.sql.*; //importing packages
import java.util.ArrayList;

public class database {
    
    public Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    public database()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load and register driver
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","");//database is "examination"
                                           //API, database,servername,port
            System.out.print("Connected");
            
        } catch (Exception e) {
            System.out.println("Error Loading: "+e);
        }
    }
    public int insert( String Username,String Email,String Password)
    {
        int output=0;
        try {
            pstmt=conn.prepareStatement("insert into examinee_signup values(?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,Username);
            pstmt.setString(3,Email);
            pstmt.setString(4,Password);
            output=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return output;
        
    }
       public int mordernWebQstn( String Question,String Answer1,String Answer2,String Answer3,String Answer4, String CorrectAnswer)
    {
        int output=0;
        try {
            pstmt=conn.prepareStatement("insert into mordern_web_questions values(?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,Question);
            pstmt.setString(3,Answer1);
            pstmt.setString(4,Answer2);
            pstmt.setString(5,Answer3);
            pstmt.setString(6,Answer4);
            pstmt.setString(7,CorrectAnswer);
            output=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return output;
        
    }
        public int computerNetworkQstn( String Question,String Answer1,String Answer2,String Answer3,String Answer4, String CorrectAnswer)
    {
        int output=0;
        try {
            pstmt=conn.prepareStatement("insert into computer_network_questions values(?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,Question);
            pstmt.setString(3,Answer1);
            pstmt.setString(4,Answer2);
            pstmt.setString(5,Answer3);
            pstmt.setString(6,Answer4);
            pstmt.setString(7,CorrectAnswer);
            output=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return output;
        
    }
        public int computerSystemQstn( String Question,String Answer1,String Answer2,String Answer3,String Answer4, String CorrectAnswer)
    {
        int output=0;
        try {
            pstmt=conn.prepareStatement("insert into computer_system_questions values(?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,Question);
            pstmt.setString(3,Answer1);
            pstmt.setString(4,Answer2);
            pstmt.setString(5,Answer3);
            pstmt.setString(6,Answer4);
            pstmt.setString(7,CorrectAnswer);
            output=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return output;
        
    }
        public int databaseQstn( String Question,String Answer1,String Answer2,String Answer3,String Answer4, String CorrectAnswer)
    {
        int output=0;
        try {
            pstmt=conn.prepareStatement("insert into database_questions values(?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,Question);
            pstmt.setString(3,Answer1);
            pstmt.setString(4,Answer2);
            pstmt.setString(5,Answer3);
            pstmt.setString(6,Answer4);
            pstmt.setString(7,CorrectAnswer);
            output=pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return output;
        
    }
        
        
        public void deleteComputerNetwork(){
     try{
     database db = new database();
     Statement st = db.conn.createStatement();
           String query="truncate table computer_network_questions";
          ResultSet rs=st.executeQuery(query);
     }
     catch(Exception ex){}
     
 }
 
  public void deleteComputerSystem(){
     try{
     database db = new database();
     Statement st = db.conn.createStatement();
           String query="truncate table computer_system_questions";
        ResultSet rs=st.executeQuery(query);
     }
     catch(Exception ex){}
     
 }
  
   public void deleteModernWeb(){
     try{
     database db = new database();
     Statement st = db.conn.createStatement();
           String query="truncate table question_modern_web";
          ResultSet rs=st.executeQuery(query);
     }
     catch(Exception ex){}
     
 }
   
    public void deleteDatabase(){
     try{
     database db = new database();
     Statement st = db.conn.createStatement();
           String query="truncate table database_questions";
         ResultSet rs=st.executeQuery(query);
     }
     catch(Exception ex){}
     
 }
    
    
    public ArrayList<GetQuestion> ModernWeb() throws SQLException{ 
        ArrayList<GetQuestion> modernweb = new ArrayList<GetQuestion>();//retrieves data
        String query = "Select * from mordern_web_questions"; //extracting from database through arraylist
        
    database db = new database();
	ResultSet rs = db.FetchData(query);//retrieves data
	GetQuestion qs;
	while (rs.next()) {//fetch function
		qs = new GetQuestion(rs.getInt("Question_ID"),rs.getString("Question"), rs.getString("Answer1"), rs.getString("Answer2"),rs.getString("Answer3"), rs.getString("Answer4"), rs.getString("CorrectAnswer"));
                modernweb.add(qs);
	}
	return modernweb;
     
     }
    
     public ArrayList<GetQuestion> ComputerNetwork() throws SQLException{ 
        ArrayList<GetQuestion> computernetwork = new ArrayList<GetQuestion>();
        String query = "Select * from computer_network_questions"; //extracting from database through arraylist
        
    database db = new database();
	ResultSet rs = db.FetchData(query);
	GetQuestion qs;
	while (rs.next()) {
		qs = new GetQuestion(rs.getInt("Question_ID"),rs.getString("Question"), rs.getString("Answer1"), rs.getString("Answer2"),rs.getString("Answer3"), rs.getString("Answer4"), rs.getString("CorrectAnswer"));
                computernetwork.add(qs);
	}
	return computernetwork;
     
     }
     
      public ArrayList<GetQuestion> Database() throws SQLException{
        ArrayList<GetQuestion> database = new ArrayList<GetQuestion>();
        String query = "Select * from database_questions";
        
    database db = new database();
	ResultSet rs = db.FetchData(query);
	GetQuestion qs;
	while (rs.next()) {
		qs = new GetQuestion(rs.getInt("Question_ID"),rs.getString("Question"), rs.getString("Answer1"), rs.getString("Answer2"),rs.getString("Answer3"), rs.getString("Answer4"), rs.getString("CorrectAnswer"));
                database.add(qs);
	}
	return database;
     
     }
      
       public ArrayList<GetQuestion> ComputerSystem() throws SQLException{
        ArrayList<GetQuestion> computersystem = new ArrayList<GetQuestion>();
        String query = "Select * from computer_system_questions";
        
    database db = new database();
	ResultSet rs = db.FetchData(query);
	GetQuestion qs;
	while (rs.next()) {
		qs = new GetQuestion(rs.getInt("Question_ID"),rs.getString("Question"), rs.getString("Answer1"), rs.getString("Answer2"),rs.getString("Answer3"), rs.getString("Answer4"), rs.getString("CorrectAnswer"));
                computersystem.add(qs);
	}
	return computersystem;
     
     }

    private ResultSet FetchData(String query) {
        try{
            pstmt=conn.prepareStatement(query);
            rs=pstmt.executeQuery();
            
        }
        catch(Exception ex){
            
        }
        return rs;
    }
       
    
}
