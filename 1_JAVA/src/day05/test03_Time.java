package day05;

public class test03_Time {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.setHour(-14);
		t1.setSecond(-20);
		t1.print();
		
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

class Time{
	private int hour;  
	private int second; //멤버 필드 
	private boolean bol;
	
	public void setHour(int hour) {
		if(hour >= 0 && hour <= 23)
			this.hour = hour;
	}
	public int getHour() {
		return hour;
	}
	
	public void setSecond(int s) {
		this.second = s;
	}
	public int getSecond() {
		return second;
	}
	
	public void print() {
		System.out.printf("[%2d시 %2d분] \n",hour, second);
	}
	
	public void setAm(boolean bol) {
		this.bol = bol;
	}
	public boolean isAm() {
		return bol;
	}
}