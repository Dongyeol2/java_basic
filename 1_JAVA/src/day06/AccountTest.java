package day06;

import util.Calc;

public class AccountTest {
	public static void main(String[] args) {
		account a1 = new account();
		a1.setAccountNum("001");
		a1.setRemainMoney(90000);
		a1.deposit(9000);
		a1.print();
		
		account a2 = new account();
		a2.setAccountNum("002");
		a2.setRemainMoney(0);
		a2.print();

		a1.accountTransfer(a1, a2, 1500);
		a1.print();
		a2.print();
		
		double sum = Calc.add(2, 4, 6, 8, 10);
		
	}
}