package atm.machine.menu;

import java.util.Scanner;

import bank.account.BankAccount;

public class NavigationMenu {
	
	public void mainMenuPrinter() {
		
		System.out.println("============================");
		System.out.println("MAIN MENU");
		System.out.println("1 - Balance");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println("4 - User Information");
		System.out.println("5 - Exit");
		System.out.println("============================");
		
	}
	
	public int readUserSelection() {
		System.out.println("============================");
		System.out.printf("Select - ");
		Scanner readUserInput = new Scanner(System.in);
		int userSelection = readUserInput.nextInt();
		System.out.println("============================");
		return userSelection;	
	}

}
