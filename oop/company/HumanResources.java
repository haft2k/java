package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HumanResources {
    // Main

    public static void main(String[] args) {
	// scanner
	Scanner sc = new Scanner(System.in);

	// arrayList staffList save Employee, Manager
	// arrayList departList save department
	ArrayList<Staff> staffList = new ArrayList<Staff>();
	ArrayList<Department> departList = new ArrayList<Department>();
	Department business = new Department(1, "Business", 0);
	Department project = new Department(2, "Project", 0);
	Department technical = new Department(3, "Technical", 0);
	departList.add(business);
	departList.add(project);
	departList.add(technical);

	// function program
	int func;
	do {
	    menu();
	    System.out.println("Enter function: ");
	    func = sc.nextInt();
	    if (func == 0) {
		break;
	    }

	    switch (func) {

	    case 1: {
		if (staffList.isEmpty()) {
		    System.out.println("Công ty chưa có nhân viên");
		} else {
		    System.out.printf("%10s %20s %10s %10s %10s %10s %10s %10s %10s %10s \n", "ID", "Title", "Name",
			    "Age", "Coe-salary", "Enter Day", "Depart", "day-off", "Over-time", "Salary");
		    for (Staff staff : staffList) {
			staff.displayInformation();
		    }
		}
		break;
	    }
	    // Show Name department
	    case 2: {
		int count = 0;
		for (Department nameDepart : departList) {
		    for (Staff staff : staffList) {
			if ((staff.getNameDepartment()).equals(nameDepart.getNameDepart())) {
			    count++;
			}
		    }
		    nameDepart.toString();
		    nameDepart.setTotalStaff(count);
		    count = 0;
		}
		break;
	    }

	    // Show staff of Department
	    case 3: {
		System.out.printf("%10s %20s %10s %10s %10s %10s %10s %10s %10s %10s\n", "ID", "Title", "Name", "Age",
			"Coe-salary", "Enter Day", "Depart", "day-off", "Over-time", "Salary");

		for (Department department : departList) {
		    System.out.println(department.getNameDepart());
		    for (Staff staff : staffList) {
			if ((staff.getNameDepartment()).equals(department.getNameDepart())) {
			    staff.displayInformation();
			}
		    }
		}
		break;

	    }

	    // add staff
	    // staff save to array list staffList
	    case 4: {

		int choosePos;
		System.out.print("Qty Staff Adding: ");
		int qtyStaff = sc.nextInt();

		for (int i = 0; i < qtyStaff; i++) {
		    System.out.println("Choose: 1. Employee ---- 2. Manager");

		    do {
			choosePos = sc.nextInt();
			if (choosePos == 1) {
			    Staff employee = new Employee();
			    employee.inputScanner();
			    staffList.add(employee);
			    break;
			} else if (choosePos == 2) {
			    Staff manager = new Manager();
			    manager.inputScanner();
			    staffList.add(manager);
			    break;
			}

		    } while (choosePos != 1 || choosePos != 2);
		}

		break;
	    }

	    // Search follow by name or id
	    case 5: {
		String search;
		int count = 0;

		System.out.print("Enter name or id: ");
		search = sc.nextLine();
		System.out.printf("%10s %20s %10s %10s %10s %10s %10s %10s %10s %10s\n", "ID", "Title", "Name", "Age",
			"Coe-salary", "Enter Day", "Depart", "day-off", "Over-time", "Salary");

		// Find staff a
		for (Staff staff : staffList) {
		    if (search.equals(staff.getNameStaff()) || search.equals(staff.getIdStaff())) {
			staff.displayInformation();
			count++;
		    }
		}

		// check if name or id no find
		if (count == 0) {
		    System.out.println("Not found. Please enter another name or id");
		}
		break;
	    }

	    // Hiển thị bảng lương giảm dần
	    case 6: {

		System.out.println("Bảng lương giảm dần");

		Collections.sort(staffList, new Comparator<Staff>() {
		    @Override
		    public int compare(Staff o1, Staff o2) {
			return ((ICalculator) o1).salaryCalc() > ((ICalculator) o2).salaryCalc() ? -1 : 1;
		    }
		});

		for (Staff staff : staffList) {
		    staff.displayInformation();
		}
		break;
	    }
	    // Hiển thị bảng lương tăng dần
	    case 7: {

		System.out.println("Bảng lương tăng dần");

		Collections.sort(staffList, new Comparator<Staff>() {
		    @Override
		    public int compare(Staff o1, Staff o2) {
			return ((ICalculator) o1).salaryCalc() > ((ICalculator) o2).salaryCalc() ? 1 : -1;
		    }
		});

		for (Staff staff : staffList) {
		    staff.displayInformation();
		}
		break;
	    }

	    default:
		System.out.println("hewaiii");
		break;
	    }
	} while (true);

    }

    public static void menu() {
	System.out.println("1. Show list staff in company");
	System.out.println("2. Show list department in company");
	System.out.println("3. Staff of department in company");
	System.out.println("4. Add Staff");
	System.out.println("5. Searching id or name");
	System.out.println("6. Show salary staff");
	System.out.println("7. Show salary decrement staff");
	System.out.println("0. Log");
    }
}
