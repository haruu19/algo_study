package im;

import java.util.Scanner;

public class boj1592 {
	static int N,M,L;
	static int[] a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		a=new int[N+1];
		int max=0;
		int cnt=0;
		int idx = 1;
		a[1] = 1;
		while(true) {
			if(max==3)
				break;
			idx = (idx+L)%N;
			a[idx]++;
			cnt++;
			max=Math.max(a[idx],max);
		}
		System.out.println(cnt);
	}
}
