package day05;

import java.util.Scanner;

/*	
문제2. Account 클래스를 구현하시오.
    계좌번호  , 잔고  , 입금 , 출금, 계좌이체, 통장정보출력
*/
public class prob5_2 {
	Scanner input = new Scanner(System.in);
	private int accountNum;
	private int remainCost;
	private int deposit;
	private int withdraw;
	private int accountTransfer;
	private String accountInfo;
	
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public int getAccountNum() {
		return accountNum;
	}
	
	public void setRemainCost(int remainCost) {
		this.remainCost = remainCost;
	}
	public int getRemainCost() {
		return remainCost;
	}
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getDeposit() {
		return deposit;
	}
	
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getWithdraw() {
		return withdraw;
	}
	
	public void setAccountTransfer(int accountTransfer) {
		this.accountTransfer = accountTransfer;
	}
	public int getAccountTransfer() {
		return accountTransfer;
	}
	
	public void setAccountInfo(String accountInfo) {
		this.accountInfo = accountInfo;
	}
	public String getAccountInfo() {
		return accountInfo;
	}
	
}
