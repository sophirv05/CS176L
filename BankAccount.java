package cs176l;

public class BankAccount {
	public String account_name;
	public double balance;
	
	public BankAccount(String name, double balanceNumber) {
		account_name = name;
		balance = balanceNumber;
	}
	
	public BankAccount() {
		account_name = "Sophia";
		balance = 0;
	}
	
	public BankAccount(double balanceNumber) {
		account_name = "Sophia";
		balance = balanceNumber;
	}
	
	public void deposit(double balanceNumber) {
		balance += balanceNumber;
	}
	
	public void withdraw(double balanceNumber) {
		balance -= balanceNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
