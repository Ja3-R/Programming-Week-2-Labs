
public class Account {

	private String name;
	private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String name, double balance) {
		this.name = name;

		if (balance >= 0.0)
			this.balance = balance;
	}

	public double withdrawal(double withdrawalAmount) {
		if (withdrawalAmount > balance) {
			System.out.println("Withdrawl amount is exceeding balance");
		} else {
			balance = balance - withdrawalAmount;
		}

		return balance;

	}
}