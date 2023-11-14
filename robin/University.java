package bob.nathan.university;
public class University
{
	private String universityName;
	public int yearOfEstablishment;
	private int numberOfDepartment;

	public University()
	{
	   System.out.println("Start of University constructor");
	   System.out.println("End of University constructor");

	}
	public void setUniversityName(String universityName)
	{
		this.universityName = universityName;
	}
	public String getUniversityName()
	{
		return universityName;
	}
	public void setYearOfEstablishment(int yearOfEstablishment)
	{
		this.yearOfEstablishment = yearOfEstablishment;
	}
	public int getYearOfEstablishment()
	{
		return yearOfEstablishment;
	}
	public void setNumberOfDepartment(int numberOfDepartment)
	{
		this.numberOfDepartment = numberOfDepartment;
	}
	public int getNumberOfDepartment()
	{
		return numberOfDepartment;
	}
}