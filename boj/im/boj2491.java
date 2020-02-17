package im;

import java.util.Arrays;
import java.util.Scanner;

public class boj2491 {
	static int N;
	static int[] a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		int max = 0;
		//case1:
		for(int i=0;i<N-1;i++) {
			if(a[i+1]>=a[i]) {
				count++;
				max = Math.max(max, count);
			}else {
				count = 0;
			}
		}
		count = 0;
		//case2:
		for(int i=0;i<N-1;i++) {
			if(a[i+1]<=a[i]) {
				count++;
				max = Math.max(max, count);
			}else {
				count = 0;
			}
		}	
		System.out.println(max+1);
	}
}
