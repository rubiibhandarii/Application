package application;

//encapsulation

public class GetQuestion {
    String Question,option1,option2,option3,option4,correctAnswer;
    int id;
    public GetQuestion(int id,String Question, String option1,String option2,String option3,String option4,String correctAnswer){
        this.Question = Question;
        this.id = id;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
}
    //retrieving data individually
    public int getId(){
    return id;
    }
    public String getQuestion(){
    return Question;
    }
       public String getOption1(){
    return option1;
    }
          public String getOption2(){
    return option2;
    }
             public String getOption3(){
    return option3;
    }
                public String getOption4(){
    return option4;
    }
                 public String correctAnswer(){
    return correctAnswer;
    }
    
}