package EmailApplication;

import java.util.Scanner;

public class Email {


		private String firstName;
		private String lastName;
		private String password;
		private String email;
		private String department;
		private String alternateEmail;
		private int mailboxCapacity = 500;
		private int defaultPasswordLength = 10;
		// Constructor to receive first and last name
		
		public Email(String firstName, String lastName) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			
			// Call a method asking for the department, return the department
			
			department = setDepartment();
			System.out.println("Selected department is: " + department);
			
			//create Email, display email
			
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "company.com";
			System.out.println("Email successfully created for " + firstName + " " + lastName);
			
			
			// Call a method that returns a random password
			
			password = setRandomPassword(defaultPasswordLength);
			System.out.println("Your password is " + password);
			
		}
		
		// Ask for the department
		
		private String setDepartment() {
			
			System.out.print("Department Codes \n1 for Sales "
					+ "\n2 for Development \n3 for Accounting \n0 for none \n"
					+ "Enter Department code: ");
			
			Scanner input = new Scanner(System.in);
			int departmentChoice = input.nextInt();
			
			if(departmentChoice == 1) {
				return "sales";
			} else if ( departmentChoice == 2) {
				return "development";
			} else if (departmentChoice == 3) {
				return "accounting";
			} else {
				return "";
			}
		}
		
		// Generate random Password
		
		private String setRandomPassword(int length) {
		
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
			char[] password = new char[length];
			
			for(int i = 0; i < length; i++) {
				
				int randomValue = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(randomValue);
			}
			
			return new String(password);
		}
		
		// Set the mailbox capacity
		
		public void setCapacity(int mailboxCapacity) {
			
			this.mailboxCapacity = mailboxCapacity;
			System.out.println("The new mailbox capacity is " + mailboxCapacity);
			
		}
		
		// Get the mailbox capacity
		
		public int getMailboxCapacity() {
			
			return mailboxCapacity;
		}
		// Set the alternate email
		
		public void setAlternateEmail(String altEmail) {
			
			this.email = altEmail;
		}
		
		// Get alternate email
		
		public String getAlternateEmail() {
			
			return alternateEmail;
		}
		
		// Change the password
	
		public void changePassword(String password) {
			
			this.password = password;
		}
		
		// Get the password
		
		public String getPassword() {
			
			return password;
		}
		
		// print name, email address and mailboxCapacity
		
		public String displayInfo() {
			
			return "NAME: " + firstName  + " " + lastName + "\n" +
					"EMAIL: " + email + "\n" +
					"MAILBOX CAPACITY: " + mailboxCapacity;
					
		}

}
