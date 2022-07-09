package assignment3;

import java.util.Scanner;


public class Employee extends Staff implements ICalculator {

    private int hourOT;

    public void setHourOT(int hourOT) {
	this.hourOT = hourOT;
    }

    public int getHourOT() {
	return hourOT;
    }

    @Override
    public void inputScanner() {
	Scanner sc = new Scanner(System.in);
	super.inputScanner();
	System.out.print("Input Hour Over-Time: ");
	setHourOT(Integer.parseInt(sc.nextLine()));
    }

    // override interface class ICaculator calc salary
    @Override
    public double salaryCalc() {
	double salary = getCoeSalaryStaff() * 3_000_000 + getHourOT() * 200_000;
	return salary;
    }

    // print out info
    @Override
    public void displayInformation() {
	System.out.printf("%10s %20s %10s %10d %10.2f %10s %10s %10d %10d %10.2f \n", getIdStaff(), "", getNameStaff(),
		getAgeStaff(), getCoeSalaryStaff(), getEnterDay(), getNameDepartment(), getNumDayOff(), getHourOT(),
		salaryCalc());
    }

}
