package util;

public class util {
	public static int[] sort(int[] a) {
		int[] t = a.clone();
		for(int i = 0; i < t.length - 1; i++) {
			int min  = i;
			for(int j = i + 1; j < t.length; j++) {
				if(t[min] > t[j]) {
					min = j;
				}
			}
			if(i != min) {
				int temp = t[i];
				t[i] = t[min];
				t[min] = temp;
			}
		}
		return t;
	}
}
