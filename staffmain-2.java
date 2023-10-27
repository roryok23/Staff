package example2;

import java.util.Scanner;

public class staffmain {

	public static void main(String[] args) {
		
		StaffList sl = new StaffList();
		//sl.displayInLine();
		
		//sl.displayDepartment("Training");
		//s1.displayInLine();
		
		Scanner input = new Scanner(System.in);
		String keepgoing;
		do{
		int ans = Menu.display();
		switch(ans){
			case 1: 
				sl.displayInLine();
				break;
			case 2:
				sl.displayDepartment();
				break;
			case 3: 
				sl.displayFullTimeStaff();
				break;
			case 4:
				sl.displayManagers();
				break;
			case 5: 
				sl.addStaff();
				break;
			case 6:
				sl.findStaffByID();
				break;
			case 7:
				sl.updateStaff();
				break;
		
				default:
					System.out.println("Sorry that was not an option on the menu");
		}
		
		System.out.println("Would you like to see the menu again? y or n");
		
		keepgoing = input.nextLine();
		//System.out.println("You choose " + ans);
		
	}while (keepgoing.equalsIgnoreCase("y"));
	}

}
