package day10;

//RuntimeException은 unchecked exception이라서 그냥 상속해줘도 상관없음
//Exception은 checked Exception이기 때문에 모든 상황 마다 try catch 해줘야함
public class MoneyException extends Exception { //예외처리 클래스는 항상 Exception을 상속해야함
	public MoneyException() {
		super("MoneyException : 금액 확인 필요");
	}
	public MoneyException(String msg) {
		super(msg);
	}
}
