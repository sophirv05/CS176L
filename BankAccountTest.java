package cs176l;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount sophia = new BankAccount("Sophia", 2000);
		sophia.deposit(100);
		sophia.withdraw(50);
		System.out.println("The balance is" + sophia.getBalance());
	}

}
