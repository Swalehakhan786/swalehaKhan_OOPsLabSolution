package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.service.CredentialService;
import com.greatlearning.employee.Employee;

public class DriverClass {

	public static void main(String[] args) {
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
    	System.out.println("Dear your generated credentials are as follows");
    	Scanner sc=new Scanner(System.in);
    	String firstName;
    	firstName=sc.nextLine();
    	String generatePassword;
    	generatePassword=sc.nextLine();
    	Employee employee = new Employee("firstName","lastName");
    	
		CredentialService cs = new CredentialService();
		String generateEmail;
		
		
	   int option = sc.nextInt();
		option=sc.nextInt();
		
		switch(option) {
	
		
		
		case 1: System.out.println("tech");break;
		case 2: System.out.println("admin");break;
		case 3: System.out.println("hr");break;
		case 4: System.out.println("legal");break;
		default : System.out.println("Please enter a valid option");break;
		
		}
		sc.close();

	}

}
