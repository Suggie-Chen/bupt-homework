package salary;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.Set; 
import java.util.Random;
import java.util.Scanner;


public class factory {
private HashMap<String,Employee > employees=new HashMap<String,Employee>();
public void initEmployees()
{
	int i=0;
	Scanner in = new Scanner(System.in) ;
	while(i<2)
	{	
		System.out.println("请输入First name:") ;
		String first = in.next() ;
		System.out.println("请输入Last name:") ;
		String last = in.next() ;
		System.out.println("请输入Social security number:") ;
		String number = in.next() ;		
		Random ram = new Random() ;//随机过程
		int num = ram.nextInt(4) ; 
		Employee employee;
		//System.out.println(num);
		switch (num)
		{
		case 0:
			System.out.println("Weekly salary:") ; //SalaridEmployee
			String weeksalary = in.next() ;
			double d=Double.valueOf(weeksalary).doubleValue();
			 employee = new SalaridEmployee(first, last, number, d) ;
			break ;
		case 1:
			System.out.println("Wage:") ; //HourlyEmployee
			String wage = in.next() ;
			double d1=Double.valueOf(wage).doubleValue();
			System.out.println("Hours:") ;
			String hours = in.next() ;
			double d2=Double.valueOf(hours).doubleValue();
			employee = new HourlyEmployee(first, last, number, d1, d2) ;
			break ;
		case 2: 
			System.out.println("Gross sales:") ;//CommissionEmployee
			String gross = in.next() ;
			double d3=Double.valueOf(gross).doubleValue();
			System.out.println("Commission rate:") ;
			String rate = in.next() ;
			double d4=Double.valueOf(rate).doubleValue();
			employee = new HourlyEmployee(first, last, number, d3, d4) ;
			break ;
		case 3: 
			System.out.println("Base salary:") ;//BasePlusCommissionEmployee
			String base = in.next() ;
			double d5=Double.valueOf(base).doubleValue();
			employee = new SalaridEmployee(first, last, number, d5) ;
			break ;
		default:
			employee= new SalaridEmployee(first, last, number, 100);//不会走到所以随意
			break;
		}
		if(addEmployee(employee)==null) 
		{
			i--;
			System.out.println(i);
		}
		else
		{
			employees.put(employee.returnSocialSecurityNumber(), employee);
		}
		i++;
	}
	
}
Employee addEmployee(Employee stu)
{
	//boolean flag=true;
	Iterator it = employees.keySet().iterator();  
	//System.out.println("yy");
    while(it.hasNext()) 
    {  
        String key = (String)it.next(); 
       // System.out.println("key:" + key);  
     //   System.out.println(stu.returnSocialSecurityNumber());
        String yString=stu.returnSocialSecurityNumber();
       // System.out.println(yString);
        if(yString.equals(key))
        {
        	//flag=false;
        	//System.out.println("break key:" + key);  
           // System.out.println("value:" + employees.get(key));  
        	//System.out.println("yyyyy");
            return null;
        }
       
       // System.out.println("value:" + employees.get(key));  
    }  
	return stu;
}
void printEmployees()
{
	Iterator it=employees.keySet().iterator();
	while(it.hasNext())
	{
		String key=(String)it.next();
		//System.out.println(key);
		Employee a=employees.get(key);
		System.out.println(a.toString());
		System.out.println("月工资：");
		System.out.println(a.earning());
	}
}
Employee getEmployee( String empSecNum)
{
	Employee aEmployee;
	Iterator iterator=employees.keySet().iterator();
	while(iterator.hasNext())
	{
		String key=(String)iterator.next();
		if(key.equals(empSecNum))
		{
			aEmployee=employees.get(key);
			return aEmployee;
		}
	}
	return null;
}
Employee deleteEmployee(String empSecNum)
{
	Employee aEmployee;
	Iterator iterator=employees.keySet().iterator();
	while(iterator.hasNext())
	{
		String key=(String)iterator.next();
		if(key.equals(empSecNum))
		{
			aEmployee=employees.get(key);
			iterator.remove();
			return aEmployee;
		}
	}
	return null;
}
Employee updateEmployee(String empSecNum ,Employee emp)
{

	if(employees.containsKey(empSecNum)){
		 employees.put(empSecNum,emp);
		 return emp;
		}
	else {
		return null;
	}
	
	
}
}
