package day10;

public class AccountTest {
	public static void main(String[] args) {
		try {
			account a1 = new account("001", 900);
			System.out.println(a1);
				
		} catch(MoneyException e) {
			System.out.println("a1" + e.getMessage());
		}
		
		try {
			account a2 = new account("002", -5000);
			System.out.println(a2);
			
		} catch(MoneyException e) {
			System.out.println("a2" + e.getMessage());
		}
//		account a1 = new account("001", 900);
//		System.out.println(a1);
//		
//		account a2 = new account("002", -5000);
//		System.out.println(a2);
	}
}