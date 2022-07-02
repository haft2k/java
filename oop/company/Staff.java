package assignment3;

import java.util.Scanner;


public abstract class Staff {
    // fields

    private String idStaff;
    private String nameStaff;
    private int ageStaff;
    private double coeSalaryStaff;
    private String enterDay;
    private String nameDepartment;
    private int numDayOff;

    // getter && setter
    public String getIdStaff() {
	return idStaff;
    }

    public void setIdStaff(String idStaff) {
	this.idStaff = idStaff;
    }

    public String getNameStaff() {
	return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
	this.nameStaff = nameStaff;
    }

    public int getAgeStaff() {
	return ageStaff;
    }

    public void setAgeStaff(int ageStaff) {
	this.ageStaff = ageStaff;
    }

    public double getCoeSalaryStaff() {
	return coeSalaryStaff;
    }

    public void setCoeSalaryStaff(double coeSalaryStaff) {
	this.coeSalaryStaff = coeSalaryStaff;
    }

    public String getEnterDay() {
	return enterDay;
    }

    public void setEnterDay(String enterDay) {
	this.enterDay = enterDay;
    }

    public String getNameDepartment() {
	return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
	this.nameDepartment = nameDepartment;
    }

    public int getNumDayOff() {
	return numDayOff;
    }

    public void setNumDayOff(int numDayOff) {
	this.numDayOff = numDayOff;
    }

    public void inputScanner() {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter ID: ");
	setIdStaff(input.nextLine());

	System.out.print("Enter Name Staff: ");
	setNameStaff(input.nextLine());

	System.out.print("Enter Age Staff: ");
	setAgeStaff(Integer.parseInt(input.nextLine()));

	System.out.print("Enter coefficients salary: ");
	setCoeSalaryStaff(Double.parseDouble(input.nextLine()));

	System.out.print("Enter Day: ");
	setEnterDay(input.nextLine());

	System.out.print("Input Number Day Off: ");
	setNumDayOff(Integer.parseInt(input.nextLine()));

	System.out.println("Choose deparment:");
	System.out.println("1. Business --- 2. Project --- 3. Technical");
	int a = Integer.parseInt(input.nextLine());
	if (a == 1) {
	    setNameDepartment("Business");
	} else if (a == 2) {
	    setNameDepartment("Project");
	} else if (a == 3) {
	    setNameDepartment("Technical");
	}

    }

    // Method abstract displayInformation()
    public abstract void displayInformation();

}
