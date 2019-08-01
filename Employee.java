public class Employee
{
	private String employeeName;
	private String employeeNum;
	private String hireDate;

	public Employee()
	{
		employeeName = "";
		employeeNum = "";
		hireDate = "";
	}

	public Employee(String name, String num, String date)
	{
		employeeName = name;
		employeeNum = num;
		hireDate = date;
	}

	public void setEmployeeName(String name)
	{
		employeeName = name;
	}

	public void setEmployeeNum(String num)
	{
		employeeNum = num;
	}

	public void setHireDate(String date)
	{
		hireDate = date;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public String getEmployeeNum()
	{
		return employeeNum;
	}

	public String getHireDate()
	{
		return hireDate;
	}

	public String toString()
	{
		String str = "EMPLOYEE NAME: " + employeeName + "\nEMPLOYEE NUMBER: " + employeeNum + "\nHIRE DATE: " + hireDate;
		return str;
	}
}







