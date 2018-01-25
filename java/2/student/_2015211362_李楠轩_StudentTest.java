package student;


import java.util.Scanner;


public class _2015211362_李楠轩_StudentTest {
    static public _2015211362_李楠轩_student createStudent()
    {

        String name,id,mark;
        int math,english,science;
        Scanner cin =new Scanner(System.in);
        _2015211362_李楠轩_student testStudent;

        while(true){
            try{
                System.out.println("请输入学生学号：");
                id=cin.next();
                testStudent=new _2015211362_李楠轩_student(id);
                System.out.println("请输入学生姓名：");
                name=cin.next();
                testStudent.test(name);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("请输入数字！");
            }
            catch (StudentNumberException e)
            {
                System.out.println("学号格式不正确，请重新输入！");
            }

        }

        while(true){
            try{
                System.out.println("请输入学生三门课成绩（数学，英语，科学成绩）：");
                mark=cin.next();
                String[] score=mark.split("@");
                math=Integer.parseInt(score[0]);
                english=Integer.parseInt(score[1]);
                science=Integer.parseInt(score[2]);
                testStudent.enterMarks(math,english,science);
                break;
            }
            catch (ScoreException e)
            {
                System.out.println("成绩数据有误，请重新输入！");
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("请输入三个数字并用@隔开！");
            }
        }
        return testStudent;
    }

    static public void main(String[] args)
    {
    	_2015211362_李楠轩_student testStudent=createStudent();
        System.out.println(testStudent);
    }
}
