package day06;
/**
 * 
 * @author student
 * @since 2019.04.30
 * @version 1.0
 */

public class account {
	private String accountNum;
	private int remainMoney;
	
	public account() {
		this("000", 0);
//		this.setAccountNum("000");
//		this.setRemainMoney(0);
	}
	
	public account(String accountNum, int remainMoney) {
		this.setAccountNum(accountNum);
		this.setRemainMoney(remainMoney);
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setRemainMoney(int remainMoney) {
		if(remainMoney > 0)
			this.remainMoney = remainMoney;
	}
	public int getRemainMoney() {
		return remainMoney;
	}
	
	public void deposit(int deposit) {
		if(deposit > 0)
			this.remainMoney += deposit; 
	}
	
	public int withdraw(int withdraw) {
		if(this.remainMoney >= withdraw) {
			this.remainMoney -= withdraw;
			return remainMoney;
		}
		System.out.println("잔고가 부족합니다.");
		return remainMoney;
	}
	
	/**
	 * 
	 * @param from : 돈 보낼 계좌 param
	 * @param to : 돈 받을 계좌 param
	 * @param money : 얼마보낼지
	 */
	public void accountTransfer(account from, account to, int money) { //매개변수로 객체넣을 수 있음
		from.withdraw(money);
		to.deposit(money);
	}
	
	public void print() {
		System.out.printf("통장정보[계좌번호 : %s, 잔고 : %d]\n", accountNum, remainMoney);
	}
}
