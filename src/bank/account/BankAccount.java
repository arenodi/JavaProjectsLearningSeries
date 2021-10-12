package bank.account;

import java.util.Scanner;

import atm.machine.menu.NavigationMenu;

public class BankAccount extends NavigationMenu {
	
	private double balance;
	private double previousTransaction;
	private String userName;
	private int userId;
	
	public BankAccount(double balance, String userName, int userId){
		this.balance = balance;
		this.userName = userName;
		this.userId = userId;
	}
	
	public void deposit(double ammount) {
		if(ammount != 0) {
			balance = balance + ammount;
			previousTransaction = ammount;
		}
	}
	
	public void withdraw(double ammount) {
		if(ammount > 0) {
			if(ammount <= balance) {
				balance = balance - ammount;
				previousTransaction = -ammount;
			} else {
				System.out.println("============================");
				System.out.println("Insuficient Account Balance!");
				System.out.println("============================");
			}
		} else {
			System.out.println("============================");
			System.out.println("Invalid ammount!");
			System.out.println("============================");
		}
	}
	
	public void getBalance() {
		System.out.println("============================");
		System.out.printf("Balance: $ %.2f%n", balance);
		System.out.println("============================");
	}
	
	public void getPreviousTransaction() {
		if(previousTransaction < 0) {
			System.out.println("============================");
			System.out.printf("Withdraw: $ %.2f%n", previousTransaction);
			System.out.println("============================");
		} else {
			System.out.println("============================");
			System.out.printf("Deposit: $ %.2f%n", previousTransaction);
			System.out.println("============================");
		}
	}
	
	public void getUserInfo() {
		System.out.println("============================");
		System.out.println("Name: " + userName);
		System.out.println("ID: " + userId);
		System.out.println("============================");
	}
	
	public double setAmmount() {
		System.out.println("============================");
		System.out.printf("Enter ammount: $ ");
		Scanner readUserInput = new Scanner(System.in);
		double ammount = readUserInput.nextDouble();
		System.out.println("============================");
		return ammount;		
	}

}
