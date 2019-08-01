public class ShiftSupervisor extends Employee
{
	private int annualSalary;
	private int productionBonus;

	public ShiftSupervisor()
	{
		annualSalary = 0;
		productionBonus = 0;
	}

	public ShiftSupervisor(String name, String num, String date, int salary, int bonus)
	{
		super(name, num, date);
		annualSalary = salary;
		productionBonus = bonus;
	}

	public void setAnnualSalary(int salary)
	{
		annualSalary = salary;
	}

	public void setProductionBonus(int bonus)
	{
		productionBonus = bonus;
	}

	public int getAnnualSalary()
	{
		return annualSalary;
	}

	public int getProductionBonus()
	{
		return productionBonus;
	}

	public String toString()
	{
		String str = "EMPLOYEE NAME: " + getEmployeeName() + "\nEMPLOYEE NUMBER: " + getEmployeeNum() + "\nHIRE DATE: " +
		getHireDate() + "\nANNUAL SALARY: " + annualSalary + "\nPRODUCTION BONUS: " + productionBonus;

		return str;
	}


}