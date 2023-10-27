package iact.day8.example1;

public class Staff {
	
	private int staffID;
	private String firstname;
	private String lastName;
	private String department;
	
	
	public Staff(){
		
		
	}
	
	public Staff(int id, String fn, String ln, String d){
		
		setStaffID(id);
		setFirstname(fn);
		setLastName(ln);
		setDepartment(d);
		
		
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int id) {
		staffID = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String fn) {
		firstname = fn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String ln) {
		lastName = ln;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String d) {
		department = d;
	}
@Override
	
	public String toString(){
		
		
		return String.format("Staff No: %d\nName: %s %s \nDepartment: %s\n",
				
				getStaffID(), getFirstname(), getLastName(), getDepartment());
	}
	

}


