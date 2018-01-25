package salary;

public class SalaridEmployee extends Employee {
	private double weeklySalary;
	public SalaridEmployee()//不带参数构造
	{
		super() ;
		weeklySalary = 0 ;
	}
	public SalaridEmployee(String first, String last, String number, double salary)//带参数构造
	{
		super(first, last, number) ;//Employee 构造;
		weeklySalary = salary ;
	}
	public double earning()//改写earning
	{
		return weeklySalary*4 ;
	}
	
	public double returnWeeklySalary()
	{
		return weeklySalary * 4 ;
	}
	
	public void setWeeklySalary(double salary)
	{
		weeklySalary = salary ;
	}
	public String toString()
	{
		return super.toString() + " weeklySalary:" +returnWeeklySalary();
	}
}
