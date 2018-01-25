package student;

import java.io.IOException;

import java.util.Scanner;

class FileFormatException extends IOException{
    public FileFormatException(){}

    public FileFormatException(String gripe){
        super(gripe);
    }
}
class ScoreException extends Exception{}

class StudentNumberException extends Exception{}

public class _2015211362_李楠轩_student {
    private String studentNumber;
    private String studentName;

    private int markForMaths;
    private int markForEnglish;
    private int markForScience;

    static private final int no_mark = -1;
    static private final int maxk = 100;
    static private final int mink = 0;
    public void test(String name) {
    	this.studentName = name;
    }
    public _2015211362_李楠轩_student(String number) throws StudentNumberException {
    	
        
    	
    	
        if ('2' != number.charAt(0) || '0' != number.charAt(1) || 10 != number.length())
            throw new StudentNumberException();
        for (int i = 2; i < number.length() ; i++)
            if (!Character.isDigit(number.charAt(i)))
                throw new StudentNumberException();
        
   
  
        studentNumber = number; 
       
        this.markForEnglish=no_mark;
        this.markForMaths=no_mark;
        this.markForScience=no_mark;
    }
   
    public _2015211362_李楠轩_student(String number,String name,int math,int english,int science){
        this.studentNumber= number;
        this.studentName = name;
        this.markForEnglish=english;
        this.markForMaths=math;
        this.markForScience=science;
    }
    public _2015211362_李楠轩_student(){
        this.studentNumber= "2019200000";
        this.studentName = "Tom";
        this.markForEnglish=no_mark;
        this.markForMaths=no_mark;
        this.markForScience=no_mark;
    }

    String getNumber(){
        return studentNumber;
    }
    String getName()
    {
        return studentName;
    }
    void enterMarks(int markForMaths,int markForEnglish,int markForScience)
            throws ScoreException{
        if(markForMaths >maxk || markForMaths <mink || markForEnglish > maxk || markForEnglish < mink || markForScience > maxk || markForScience < mink)
            throw new ScoreException();
        else{
            this.markForMaths=markForMaths;
            this.markForEnglish=markForEnglish;
            this.markForScience=markForScience;
        }
    }

    int getMarkForMaths(){
        return markForMaths;
    }
    int getMarkForEnglish(){
        return markForEnglish;
    }
    int getMarkForScience(){
        return markForScience;
    }
    double calculateAverage(){
        double i=(double)markForMaths;
        double j=(double)markForEnglish;
        double k=(double)markForScience;
        return ((i+j+k)/3.0D);
    }
    public String toString(){
        StringBuilder temp=new StringBuilder("");

        temp.append("学生信息如下：");
        temp.append("\n学号"+studentNumber);
        temp.append("\n姓名"+studentName);
        temp.append("\n数学成绩"+markForMaths);
        temp.append("\n英语成绩"+markForEnglish);
        temp.append("\n科学成绩"+markForScience);
        temp.append("\n平均成绩"+calculateAverage());
        return temp.toString();
    }
}