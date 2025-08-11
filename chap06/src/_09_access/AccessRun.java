package _09_access;

import _10_bank.Bank;

public class AccessRun {

	public static void main(String[] args) {
		Access ac = new Access();
		
		// ac.num = 5;  접근 불가
		ac.setNum(5);
		
		// int num = ac.num;  접근 불가
		System.out.println(ac.getNum());
		
		Bank bank = new Bank();
		bank.deposit(5000);
	}

}
