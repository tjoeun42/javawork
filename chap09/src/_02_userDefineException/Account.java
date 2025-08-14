package _02_userDefineException;

public class Account {
	private int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int getBalance() {
		return balance;
	}
	
	void witdraw(int money) throws UserException {
		if(balance < money)
			throw new UserException("잔고부족 : " + (money-balance) + " 부족");
		else
			balance -= money;
	}
}
