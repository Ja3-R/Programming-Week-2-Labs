import java.util.Scanner;

public class AccounrtClass {

	private static double newBalance;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Account account1 = new Account("Cheque account", 505.00);

		System.out.println(account1.getName() + " account balance: $" + account1.getBalance());

		System.out.print("Enter withdrawal amount for Cheque account: $");
		double withdrawalAmount = input.nextDouble();

		newBalance = account1.withdrawal(withdrawalAmount);

		System.out.println("New balance for " + account1.getName() + " after withdrawal is: $" + newBalance);

	}

}
