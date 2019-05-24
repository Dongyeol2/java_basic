package day03;

public class test06_gugudan {
	public static void main(String args[]) {
	OUT:for(int i = 1; i <= 9; i++) { //라벨링 작업 -> 무슨 for loop인지 의미부여
			for(int j = 2; j <= 9; j++) {
				//if(j == 5) break;
				//if(j == 5) continue;
				if(j == 5) break OUT;//위치지정해서 내가 원하는 위치에서 빠져나올 수 있다.
				
				System.out.printf("%d * %d = %2d|",j,i,i*j);
			}
			System.out.println();
		}
	}
}
