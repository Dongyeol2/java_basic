package day10;

import java.io.Serializable; //필요하면 String 통과

/**
 * 
 * @author student
 * @since 2019.04.30
 * @version 1.0
 */

public class account extends Object implements Serializable{
	private String accountNum;
	private int remainMoney;
	
	public account() throws MoneyException {
		this("000", 0);
	}
	
	public account(String accountNum, int remainMoney) throws MoneyException{
		this.setAccountNum(accountNum);
		//try {
			this.setRemainMoney(remainMoney);
		//}catch(MoneyException e){
		//	System.out.println("음수면 안됨..");
		//}
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setRemainMoney(int remainMoney) throws MoneyException {
		if(remainMoney < 0) 
			throw new MoneyException();
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

	@Override
	public String toString() {
		return "account [accountNum=" + accountNum + ", remainMoney=" + remainMoney + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		account other = (account) obj;
		if (accountNum == null) {
			if (other.accountNum != null)
				return false;
		} else if (!accountNum.equals(other.accountNum))
			return false;
		if (remainMoney != other.remainMoney)
			return false;
		return true;
	}
	
	
}
