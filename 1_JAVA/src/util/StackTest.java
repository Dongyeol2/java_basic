package util;

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1) 
				System.out.println(num);
			else
				break;
			//System.out.println(num);
		}

	}
}
class MyStack {
	//List<Integer> list = new ArrayList<Integer>();
	int[] st;
	int count = 0;
	
	public MyStack() {
		st = new int[10];
	}
	public MyStack(int i) {
		st = new int[i > 0? i : 10];
	}
	
	public boolean isEmpty() {
//		if(list.size() == 0)
//			return true;
//		return false;
		return count == 0? true : false;
	}
	
	public boolean isFull() {
//		if(list.size() == 10)
//			return true;
//		return false;
		return count == st.length? true : false;
	}
	
	public void push(int i) {
		//list.add(i);
		if(isFull()) {
			System.out.println("스택이 가득 찾습니다.");
		}
		else {
			st[count++] = i;
		}
	}
	
	public int pop() {
//		int a;
//		if(list.size() > 0) {
//			a = list.get(list.size()-1);
//			list.remove(list.size()-1);
//		}
//		else {
//			a = -1;
//		}
//		return a;
		int data = -1;
		if(count != 0) {
			data = st[count- 1];
			st[count-1] = 0;
			count--;
		}
		return data;
	}
	
	public int top() {
//		int a = list.get(list.size()-1);
//		return a;
		return count == 0? -1 : st[count-1];
	}
}
