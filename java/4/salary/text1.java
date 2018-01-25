package salary;

import java.util.Random;
import java.util.Scanner;

public class text1 {
	public static void main(String[] args)
	{
		factory aFactory=new factory();
		aFactory.initEmployees();
		System.out.println("Welcome to Employees Database .");
		Scanner sc = new Scanner(System.in);   
	    while (true)
	    {
	    	System.out.println("����");
	        System.out.println("1. find   2. update   3. delete  4. print");
	        System.out.println("5. exit"); 
	    	int command = sc.nextInt();
	         boolean exitKey = false;
	         String empSecNum;
	         switch (command)
		            {
		                case (1):
		                	System.out.println("�������");
		                	empSecNum = sc.next();
		                	if(aFactory.getEmployee(empSecNum)==null)
		                	{
		                		System.out.println("û�ҵ�");
		                	}
		                	else
		                		System.out.println(aFactory.getEmployee(empSecNum).toString());;
		                    break;
		                case (2):
		                	System.out.println("�������");
	                		empSecNum = sc.next();
	                		Employee aEmployee=aFactory.getEmployee(empSecNum);
	                		if(aEmployee!=null) {
	                			System.out.println("first name");
	                		String aString=sc.next();
	                		System.out.println("next name");
	                		String bString=sc.next();
	                		aEmployee.setFirstName(aString);
	                		aEmployee.setLastName(bString);
	                		aFactory.updateEmployee(empSecNum, aEmployee);
	                		}
	                		else {
	                			System.out.println("�޴���");
							}
	                		
		                    break;
		                case (3):
		                	System.out.println("�������");
                			empSecNum = sc.next();
                			aFactory.deleteEmployee(empSecNum);
		                    break;
		                case (4):
		                   aFactory.printEmployees();
		                    break;
		                case (5):
		                    exitKey = true;
		                    break;
		                default:
		                    System.out.println("��������");
		            }
	        if (exitKey) break;      
	    }
	}
}
