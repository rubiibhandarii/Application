package application;

public class Register {
    
    private int Student_Id;
    private String Student_Username;
    private String Password;
    private String Email;
    
    public Register(int Student_Id,String Student_Username,String Email,String Password){
        this.Student_Id=Student_Id;
        this.Student_Username=Student_Username;
         this.Email=Email;
        this.Password=Password;   
            
    }
    
    public int getId(){
        return Student_Id;
    }
    
    public String getUsername(){
        return Student_Username;
        
    }
    
    public String getEmail(){
     
        return Email;
    }
    
     public String getPassword(){
        return Password;
    }
    
    
}