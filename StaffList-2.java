package example2;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffList {
	
	
	private ArrayList<Staff> s = new ArrayList<Staff>();

	public StaffList(){
		s.add(new Staff(1234, "Eoin", "Lynch", 60000.0, "Training", true, true));
		s.add(new Staff(3456, "Cara", "Martin", 70000.0, "IT", true, true));
		s.add(new Staff(7891, "Amy", "Allan", 30000.0, "Sales", true, false));
		s.add(new Staff(2345, "John", "Doyle", 45000.0, "Finance", true, false));
		s.add(new Staff(6789, "Frank", "Lynch", 55000.0, "Admin", true, false));
		s.add(new Staff(0123, "Declan", "Lynch", 60000.0, "Sales", true, false));
		s.add(new Staff(4567, "Eoin", "Lynch", 60000.0, "Training", true, false));
		s.add(new Staff(8901, "Eoin", "Lynch", 80000.0, "Training", true, false));
		s.add(new Staff(2346, "Eoin", "Lynch", 20000.0, "Sales", true, false));
		s.add(new Staff(7890, "Eoin", "Lynch", 60000.0, "HR", true, false));
		
		
		}
	
	public void displayInLine(){
		
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "staffID", "firstName", "lastName", "salary", "department", "fulltime", "manager");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		
		for(int i = 0; i<s.size(); i++){
			s.get(i).displayInline();
			
		}
	}
	
	
	public void displayDepartment(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a department: ");
		String d = input.nextLine();
		displayDepartment(d);
		
		
	}
	public void displayDepartment(String d){
		
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "staffID", "firstName", "lastName", "salary", "department", "fulltime", "manager");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		int num = 0;
		for(int i = 0; i<s.size(); i++){
			if (s.get(i).getdepartment().equalsIgnoreCase(d)){
				s.get(i).displayInline();
				num++;
			}
			//s[i].displayInline();
			
		}
		
		System.out.println(num + " items found");
	}
	
	//System.out.println(num + " items found");
	public void displayFullTimeStaff(){
	
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "staffID", "firstName", "lastName", "salary", "department", "fulltime", "manager");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		int num = 0;
		for(int i = 0; i<s.size(); i++){
			if (s.get(i).getfulltime()){
				s.get(i).displayInline();
				num++;
			}
			//s[i].displayInline();
			
		}
		
		System.out.println(num + " items found");
	
}


	
public void displayManagers(){
		
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "staffID", "firstName", "lastName", "salary", "department", "fulltime", "manager");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		int num = 0;
		for(int i = 0; i<s.size(); i++){
			if (s.get(i).getmanager()){
				s.get(i).displayInline();
				num++;
			}
			//s[i].displayInline();
			
		}
		
		System.out.println(num + " items found");
	
}
		
		
	
	

	public void addStaff(){
		Scanner inputText = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		int sid;
		String fn, ln, dep, sft, sman;
		//String fn, ln, dep;
		double sal;
		boolean ft, man;
		System.out.println("What is the Staff id: ");
		sid = inputNumber.nextInt();
		System.out.println("Enter First Name: ");
		fn = inputText.nextLine();
		System.out.println("Enter Last Name: ");
		ln = inputText.nextLine();
		System.out.println("Enter Department: ");
		dep = inputText.nextLine();
		System.out.println("Enter Salary: ");
		sal = inputNumber.nextDouble();
		System.out.println("Are they full time? y or n: ");
		sft = inputText.nextLine();
		ft = (sft.equalsIgnoreCase("y")? true: false);
		System.out.println("Are they a manager? y or n: ");
		sman = inputText.nextLine();
		man = (sman.equalsIgnoreCase("y")? true: false);
		
		s.add(new Staff(sid,fn,ln,sal,dep,ft,man));
		
		System.out.println("Staff member has been added: ");
		s.get(s.size()-1); //display the last element that was added to the array list
	}
	
	public Staff findStaffByID(int id){
		
		Staff st = new Staff();
		
		for(int i=0; i<s.size(); i++){
			if (s.get(i).getstaffID()==id){
				st = s.get(i);
			}
		}
		return st;
	}
	public void findStaffByID(){
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the staff id: ");
		int id = input.nextInt();
		Staff st = findStaffByID(id);
		if(st.getstaffID()==0){
			System.out.println("Staff Not Found");
		}else{
			st.display();
		}
	}
	
	public void updateStaff(){
		
		Scanner inputNumber = new Scanner (System.in);
		Scanner inputText = new Scanner(System.in);
		int sid;
		String fn, ln, dep, sft, sman, ans;
		boolean ft, man;
		double sal;
		System.out.println("Please enter the staff id of the staff member you wish to update: ");
		int id = inputNumber.nextInt();
		Staff st = findStaffByID(id);
		if(st.getstaffID()==0){
			System.out.println("Staff Not Found");
		}else{
			//update staff member
			System.out.println("Staff ID is currently: " + st.getstaffID());
			System.out.println("Would you like to change this? y or n");
			ans = inputText.nextLine();
			if (ans.equalsIgnoreCase("y")){
				System.out.println("Please enter the New ID: ");
				id = inputNumber.nextInt();
				st.setstaffID(id);
			}
			System.out.println("First Name is currently : " + st.getfirstName());
			System.out.println("Would you like to change this? y or n ");
			ans = inputText.nextLine();
			if (ans.equalsIgnoreCase("y")){
				System.out.println("Please enter the new first name:");
				fn = inputText.nextLine();
				st.setfirstName(fn);
			}
			System.out.println("Last Name is currently : " + st.getlastName());
			System.out.println("Would you like to change this? y or n ");
			ans = inputText.nextLine();
			if (ans.equalsIgnoreCase("y")){
				System.out.println("Please enter the new last name:");
				ln = inputText.nextLine();
				st.setfirstName(ln);
			}
			System.out.println("Last Name is currently : " + st.getdepartment());
			System.out.println("Would you like to change this? y or n ");
			ans = inputText.nextLine();
			if (ans.equalsIgnoreCase("y")){
				System.out.println("Please enter the new department:");
				dep = inputText.nextLine();
				st.setdepartment(dep);
			}
			System.out.printf("Salary is currently %.2f\n", + st.getsalary());
			System.out.println("Would you like to change this? y or n ");
			//ans = inputText.nextLine();
			ans = inputText.nextLine();
			if (ans.equalsIgnoreCase("y")){
				System.out.println("Please enter the new salary:");
				sal = inputNumber.nextDouble();
				st.setsalary(sal);
			}
			if(st.getfulltime()){
				System.out.printf("%s %s is currently FullTime\n",
						st.getfirstName(), st.getlastName());
			} else {
				System.out.printf("%s %s is currently Not FullTime\n",
						st.getfirstName(), st.getlastName());
			}
			System.out.println("Would you like to change this? y or n");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				st.setfulltime(!st.getfulltime());
			}


			if(st.getmanager()){
				System.out.printf("%s %s is currently a manager\n",
						st.getfirstName(), st.getlastName());
			} else {
				System.out.printf("%s %s is currently Not a manager\n",
						st.getfirstName(), st.getlastName());
			}
			System.out.println("Would you like to change this? y or n");
			ans = inputText.nextLine();
			if(ans.equalsIgnoreCase("y")){
				st.setfulltime(!st.getmanager());
			}
		}
	}
}



