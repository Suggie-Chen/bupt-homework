package salary;

public class HourlyEmployee extends Employee{
	private double wage ;
	private double hours ;
	public HourlyEmployee()//构造不带带参数
	{
		super() ;
		wage = 0 ;
		hours = 0 ;
	}
	
	public HourlyEmployee(String first, String last, String number, double Wage, double Hours)//构造带参数
	{
		super(first, last, number) ;
		wage = Wage ;
		hours = Hours ;
	}
	public double earning()
	{
		return wage * hours ;
	}
	
	public double returnWage()
	{
		return wage ;
	}
	
	public double returnHours()
	{
		return hours ;
	}
	
	public void setWage(double aWage)
	{
		wage = aWage ;
	}
	
	public void setHours(double aHours)
	{
		hours = aHours ;
	}
	
	public String toString()
	{
		return super.toString() + " wage:" + wage + " hours:" + hours ;
	}
}
