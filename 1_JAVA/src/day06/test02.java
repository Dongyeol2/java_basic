package day06;

public class test02 {
	public static void main(String[] args) {
		account a1 = new account();
		a1.setAccountNum("002");
		a1.setRemainMoney(900);
		a1.print();
		
		account a2 = new account("001", 100);
		a2.print();
		
		account a3 = new account();
		a3.print();
	
	}
}
