package email.app;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String emailAddress;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companyDomain = "adabusiness.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		
		this.password = generateRandomPassword(defaultPasswordLength);
		
		emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyDomain;
	}
	
	private String setDepartment() {
		System.out.print("Select your department:\n1 - Sales\n2 - Development\n3 - Accounting\n0 - None\n> ");
		Scanner in = new Scanner(System.in);
		int userOption = in.nextInt();
		switch(userOption) {
		case 1:
			return "Sales";
		case 2:
			return "Development";
		case 3:
			return "Accounting";
		default:
			return "";
		}
	}
	
	private String generateRandomPassword(int length) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] passwordSequence = new char[length];
		for(int passwordCharacter= 0; passwordCharacter < length; passwordCharacter++) {
			int randomValue = (int)(Math.random() * passwordSet.length());
			passwordSequence[passwordCharacter] = passwordSet.charAt(randomValue);
		}
		return new String(passwordSequence);
	}
	
	public void setPasswordLength(int passwordLength) {
		if(passwordLength > 8) {
			this.defaultPasswordLength = passwordLength;
		}
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}

	public int getDefaultPasswordLength() {
		return defaultPasswordLength;
	}

	public void setDefaultPasswordLength(int defaultPasswordLength) {
		this.defaultPasswordLength = defaultPasswordLength;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String displayInformation() {
		return "NAME: " + firstName + " " + lastName +
				"\nEMAIL ADDRESS: " + emailAddress +
				"\nPASSWORD: " + password +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB" +
				"\nALTERNATE EMAIL: " + alternateEmail;
	}
}
