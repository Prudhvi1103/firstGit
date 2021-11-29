class Employee 
{
	public String empName;
	public String empEmail;
	public double empSal;
	public static String empCompany = "IBM";
	public static String empJobRole = "Developer";

	public Employee(String a,String b,double c)
	{
		empName = a;
		empEmail = b;
		empSal = c;
		
	}
	public double findAnnualSalary()
	{
      return empSal*12; /* or double annualSal = empSal*12;
	                           return annualSal;*/
	}
	public void printEmpDetails()
	{
		 System.out.println("*****************************************************");
		System.out.println(" i'm a "+empJobRole+" in "+empCompany);
        System.out.println(" myself - "+empName);
		System.out.println(" contact me @ - "+empEmail);
        System.out.println(" Monthly i make  - "+empSal+" Rs /- ");
		System.out.println(" Yearly i earn "+findAnnualSalary()+" Rs /-");
            System.out.println("*****************************************************");
	}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("VAMSI","leelavamsi1998@gmail.com",40000.00);
		Employee e2 = new Employee("LEELA","leelavamsi1432@gmail.com",50000.00);
		e1.printEmpDetails();
		e2.printEmpDetails();
        
		
		
	}
}
