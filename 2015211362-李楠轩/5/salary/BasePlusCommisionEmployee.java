package salary;

public class BasePlusCommisionEmployee extends CommisionEmployee{
	private double baseSalary ;
	
	public BasePlusCommisionEmployee()
	{
		super() ;
		baseSalary = 0 ;
	}
	
	public BasePlusCommisionEmployee(String first, String last, String number, double Grassgross, double rate, double salary)
	{
		super(first, last, number, Grassgross, rate) ;
		baseSalary = 0 ;
	}
	public double returnBaseSalary()
	{
		return baseSalary ;
	}
	
	public void setBaseSalary(double salary)
	{
		baseSalary = salary ;
	}
	
	public String toString()
	{
		return super.toString() + " baseSalary:" + baseSalary ;
	}
	public double earning()
	{
		return returnGrossSales() * returnCommissionRate() + baseSalary ;
	}
	
	
}
