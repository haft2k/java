package assignment3;

import java.util.Scanner;

public class Manager extends Staff implements ICalculator {
    // fields

    private String title;
    Scanner sc = new Scanner(System.in);

    // setter & getter
    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    // interface class ICaculator calc salary
    @Override
    public double salaryCalc() {
	double salary = 0.0d;
	if (getTitle().equals("Leader Business")) {
	    salary = getCoeSalaryStaff() * 5000000 + 8_000_000;
	} else if (getTitle().equals("Leader Project")) {
	    salary = getCoeSalaryStaff() * 5_000_000 + 5_000_000;
	} else if (getTitle().equals("Leader Technical")) {
	    salary = getCoeSalaryStaff() * 5_000_000 + 6_000_000;
	} else {
	    salary = getCoeSalaryStaff() * 5_000_000;
	}
	return salary;
    }

    // override inputScanner() of Staff.java
    @Override
    public void inputScanner() {
	super.inputScanner();
	System.out.print("Enter title: ");
	setTitle(sc.nextLine());
    }

    // Override displayInformation() of Staff.java
    @Override
    public void displayInformation() {
	System.out.printf("%10s %20s %10s %10d %10.2f %10s %10s %10d %10s %10.2f\n", getIdStaff(), getTitle(),
		getNameStaff(), getAgeStaff(), getCoeSalaryStaff(), getEnterDay(), getNameDepartment(), getNumDayOff(),
		"", salaryCalc());
    }

}
