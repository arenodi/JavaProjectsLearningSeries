package atm.machine;

import atm.machine.menu.NavigationMenu;
import bank.account.BankAccount;

public class AtmMachine {
	public static void main(String[] args) {
		
		BankAccount userAccount =  new BankAccount(5000, "Andre", 3214);
		int userSelection;
		boolean ATMFLAG = true;
		
		while(ATMFLAG) {
			userAccount.mainMenuPrinter();
			userSelection = userAccount.readUserSelection();
					
			switch(userSelection) {
			case 1:
				userAccount.getBalance();
				break;
			case 2:
				userAccount.deposit(userAccount.setAmmount());
				break;
			case 3:
				userAccount.withdraw(userAccount.setAmmount());
				break;
			case 4:
				userAccount.getUserInfo();
				break;
			case 5:
				System.out.println("+++============================+++");
				System.out.println("Thank you for using our Services!");
				System.out.println("+++============================+++");
				ATMFLAG = false;
				break;
			default:
				System.out.println("============================");
				System.out.println("Choose a valid option!");
				System.out.println("============================");
			}
		}
	}
}
