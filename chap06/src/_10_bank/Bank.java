package _10_bank;

public class Bank {
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if(balance < money)
			System.out.println("잔고부족");
		else
			balance -= money;
	}
	
	int getBalance() {
		return balance;
	}
}
