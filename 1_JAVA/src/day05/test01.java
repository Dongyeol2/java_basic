package day05;

import javax.swing.JOptionPane;

public class test01 {
	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("이름을 입력해 주세요"); //단순한 swing 입력 패널
		System.out.println(data);
		
		String jumsu = JOptionPane.showInputDialog("국어/영어/수학 점수를 입력해 주세요(90/90/70)");
		System.out.println(jumsu);

		double sum = 0;
		for(int i = 0; i < jumsu.split("/").length; i++)
			sum += Integer.parseInt(jumsu.split("/")[i]); //[i] 의미 : split한 뒤에 i번째 index가져오겠다.
		System.out.printf("%.2f", sum/jumsu.split("/").length);
	}

}
