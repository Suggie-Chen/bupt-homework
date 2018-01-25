package salary;

import java.util.Scanner;

import java.util.Random;

import java.util.Vector;

public class _2015211362_�����_TestEmployee {
    static final int Salarid=0;
    static final int Hourly=1;
    static final int Commision=2;
    static final int BasePlusCommision=3;
    static final int Enumber=3;

    public static void main(String[] args)
    {

        Vector Employees=new Vector();
        Random rand =new Random(25);
        String f,l,s;
        Scanner cin =new Scanner(System.in);
        try{
            for(int i=0;i<Enumber;i++)
            {
                System.out.println("����������firstname��lastname��socialSecurityNumber");
                String t=cin.next();
                String[] a=t.split("\\|");
                if(a.length!=3)
                    throw new Exception("Error Input");
                else{
                    f=a[0];
                    l=a[1];
                    s=a[2];
                }
                int choice=rand.nextInt(4);
                switch (choice)
                {
                    case Salarid:
                    {
                        System.out.println("��н��");
                        double temp=cin.nextDouble();
                        Employees.add(new _2015211362_�����_SalaridEmployee(temp,f,l,s));
                        break;
                    }
                    case Hourly:
                    {
                        System.out.println("����ʱ�䣺");
                        double ho=cin.nextDouble();
                        System.out.println("нˮ��");
                        double wa=cin.nextDouble();
                        Employees.add(new _2015211362_�����_HourlyEmployee(wa,ho,f,l,s));
                        break;
                    }
                    case Commision:
                    {
                        System.out.println("���۶");
                        double gr=cin.nextDouble();
                        System.out.println("Ӷ���ʣ�");
                        double co=cin.nextDouble();
                        Employees.add(new _2015211362_�����_CommisionEmployee(co,gr,f,l,s));
                        break;
                    }
                    case BasePlusCommision:
                    {
                        System.out.println("���۶");
                        double gr=cin.nextDouble();
                        System.out.println("Ӷ���ʣ�");
                        double co=cin.nextDouble();
                        System.out.println("��������");
                        double ba=cin.nextDouble();
                        Employees.add(new _2015211362_�����_BasePlusCommisionEmployee(ba,co,gr,f,l,s));
                        break;

                    }
                }
            }
        }
        catch(Exception e) {
            System.out.println("error");
        }
        for(int i=0;i<Enumber;i++) {
            System.out.println(Employees.get(i));
        }
    }
}