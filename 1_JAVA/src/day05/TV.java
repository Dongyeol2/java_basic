package day05;

public class TV { 
	//클래스의 구성요소 : 데이터(속성) + 메소드(Method)
	String color;
	int size;
	boolean power;
	int channel;
	
	public void channelUp() {
		this.channel++;
	}
	
	public void channelDown() {
		this.channel--;
	}
	
	public void power() {
		this.power = !this.power;
	}
	public void print() {
		System.out.printf("TV[전원상태: %b, 현재채널: %d, %s] \n"
				,this.power, this.channel, this.color);
	}
	
	
}
