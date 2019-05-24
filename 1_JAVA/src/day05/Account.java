package day05;

import java.util.Scanner;
//동사면 함수, 명사면 변수
public class Account {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		prob5_2 account = new prob5_2();
		while (true) {
			System.out.println("***************************");
			System.out.println("*****Account Application******");
			System.out.println("***************************");

			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 확인");
			System.out.println("3. 잔고 확인");
			System.out.println("4. 입     금");
			System.out.println("5. 출     금");
			System.out.println("6. 계좌 이체");
			System.out.println("7. 종     료");

			System.out.println("***************************");
			
			int sel = input.nextInt();
			
			if(sel > 7) 
				sel = 7;
			
			switch(sel) {
			case 1 :
				int accountNum;
				System.out.println("1. 계좌 생성 ");
				System.out.print("생성할 계좌번호를 입력해 주세요 : ");
				accountNum = input.nextInt();
				account.setAccountNum(accountNum);
				account.setRemainCost(0);
				break;
				
			case 2 :
				System.out.println("2. 통장 정보 ");
				System.out.println("당신의 계좌번호 : " + account.getAccountNum()); 
				System.out.printf("당신의 잔    고 : %d원\n",account.getRemainCost()); 
				break;
				
			case 3 :
				System.out.println("3. 잔     고 ");
				System.out.printf("당신의 잔    고 : %d원\n",account.getRemainCost()); 
				break;
				
			case 4 :
				int deposit;
				System.out.println("4. 입     금 ");
				System.out.print("입금할 금액을 입력해 주세요 : ");
				deposit = input.nextInt();
				account.setDeposit(deposit);
				account.setRemainCost(deposit + account.getRemainCost());
				System.out.printf("%d원의 금액이 입금되었습니다.\n", account.getDeposit());
				System.out.printf("당신의 잔고 : %d원\n",account.getRemainCost());
				break;
				
			case 5 :
				int withdraw;
				System.out.println("5. 출     금 ");
				System.out.println("출금할 금액을 입력해 주세요 : ");
				withdraw = input.nextInt();
				if(withdraw > account.getRemainCost()) {
					System.out.println("출금액이 잔고에 있는 금액보다 커서 출금할 수 없습니다.\n");
					break;
				}
				else {
					account.setWithdraw(withdraw);
					account.setRemainCost(account.getRemainCost() - withdraw);
					System.out.printf("%d원의 금액이 출금되었습니다.\n", account.getWithdraw());
					System.out.printf("당신의 잔고 : %d원\n",account.getRemainCost());	
				}
				break;
				
			case 6 :
				int accountN;
				int cost;
				System.out.println("6. 계좌 이체 ");
				System.out.println("계좌이체할 상대방 계좌번호를 입력해 주세요 : ");
				accountN = input.nextInt();
				System.out.println("얼마를 계좌이체 하시겠습니까? : ");
				cost = input.nextInt();
				if(cost > account.getRemainCost()) {
					System.out.println("계좌이체할 금액이 잔고에 있는 금액보다 커서 출금할 수 없습니다.\n");
					break;
				}
				else {
					account.setRemainCost(account.getRemainCost() - cost);
					System.out.printf("%d원의 금액이 계좌이체 되었습니다.\n", cost);
					System.out.printf("당신의 잔고 : %d원 \n",account.getRemainCost());
				}
				break;
				
			default :
				System.out.println("7. 종    료");
				break;
			}
			
			if(sel == 7)
				break;
		}
	}

}
