package email.app;

public class EmailApp {
	public static void main(String[] args) {
		Email userEmail = new Email("Andre", "Alves");
		
		System.out.println(userEmail.displayInformation());
		
		userEmail.changePassword("dasjkl34221!");
		userEmail.setAlternateEmail("andre@gmails.com");
		userEmail.setMailboxCapacity(250);
		userEmail.setDepartment("Research");
		
		System.out.println("\n" + userEmail.displayInformation());
	}
}
