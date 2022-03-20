package assignment3;

public class Department {
    // fields

    private int idDepart;
    private String nameDepart;
    private int totalStaff;

    public Department(int idDepart, String nameDepart, int totalStaff) {
	this.idDepart = idDepart;
	this.nameDepart = nameDepart;
	this.totalStaff = totalStaff;
    }

    public int getIdDepart() {
	return idDepart;
    }

    public void setIdDepart(int idDepart) {
	this.idDepart = idDepart;
    }

    public String getNameDepart() {
	return nameDepart;
    }

    public void setNameDepart(String nameDepart) {
	this.nameDepart = nameDepart;
    }

    public int getTotalStaff() {
	return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
	this.totalStaff = totalStaff;
    }

    @Override
    public String toString() {
	return "ID Department: " + getIdDepart() + "\nName Department: " + getNameDepart() + "\nTotal Staff: "
		+ getTotalStaff();
    }

}
