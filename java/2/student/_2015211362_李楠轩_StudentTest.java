package student;


import java.util.Scanner;


public class _2015211362_�����_StudentTest {
    static public _2015211362_�����_student createStudent()
    {

        String name,id,mark;
        int math,english,science;
        Scanner cin =new Scanner(System.in);
        _2015211362_�����_student testStudent;

        while(true){
            try{
                System.out.println("������ѧ��ѧ�ţ�");
                id=cin.next();
                testStudent=new _2015211362_�����_student(id);
                System.out.println("������ѧ��������");
                name=cin.next();
                testStudent.test(name);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("���������֣�");
            }
            catch (StudentNumberException e)
            {
                System.out.println("ѧ�Ÿ�ʽ����ȷ�����������룡");
            }

        }

        while(true){
            try{
                System.out.println("������ѧ�����ſγɼ�����ѧ��Ӣ���ѧ�ɼ�����");
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
                System.out.println("�ɼ������������������룡");
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("�������������ֲ���@������");
            }
        }
        return testStudent;
    }

    static public void main(String[] args)
    {
    	_2015211362_�����_student testStudent=createStudent();
        System.out.println(testStudent);
    }
}
