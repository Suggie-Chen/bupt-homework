package salary;

public abstract class Employee {

		public abstract double earning() ;
		private String firstName ;
		private String lastName ;
		private String socialSecurityNumber ;//ss号码
		
		public Employee()//构造函数
		{
			firstName = "" ;
			lastName = "" ;
			socialSecurityNumber = "" ;
		} 
		
		public Employee(String first, String last, String number)//带参数构造函数
		{
			firstName = first ;
			lastName = last ;
			socialSecurityNumber = number ;
		}
		
		
		public void setLastName(String last)
		{
			lastName = last ;
		}
		public String returnLastName()
		{
			return lastName ;
		}
		public void setFirstName(String first)
		{
			firstName = first ;
		}
		public String returnFirstName()
		{
			return firstName ;
		}
		public String returnSocialSecurityNumber()
		{
			return socialSecurityNumber ;
		}
		public String toString()
		{
			return ("firstName:" + firstName + " lastName:" + lastName + " socialSecurityNumber:" + socialSecurityNumber) ;
		}
}
