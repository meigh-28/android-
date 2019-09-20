package com.example.myquiz;

public class Questions {

    private String question;
    String A,B,C,D;

    private String rightAnswer;
    private int correctAnswersCount=0;
    private  int quizCount = 1;

    public  Questions(){

    }
    public Questions(String question,String a,String b ,String c,String d,String rightAnswer,int correctAnswersCount,int quizCount)  {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.correctAnswersCount = correctAnswersCount;
        this.quizCount = quizCount;

        A = a;
        B=b;
        C=c;
        D=d;

    }



    public String getquestion(){return question;}
    public void setquestion(String question){this.question = question;}


    public String getRightAnswer(){return rightAnswer;}
    public void setRightAnswer(String rightAnswer){this.rightAnswer = rightAnswer;}

//    public int getcorrectAnswersCount(){return correctAnswersCount;}
//    public void setcorrectAnswersCount(int correctAnswersCount){this.correctAnswersCount = correctAnswersCount;}


    public String getA(){return A;}
    public void setA(String a){A=a;}

    public String getB(){return B;}
    public void setB(String b){B=b;}

    public String getC(){return C;}
    public void setC(String c){C=c;}

    public String getD(){return D;}
    public void setD(String d){D=d;}












}
