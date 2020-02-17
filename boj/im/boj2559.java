package im;

import java.util.Scanner;

public class boj2559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int K= sc.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<=N-K;i++) {
			int sum = 0;
			for(int k=i;k<=i+K-1;k++) {
				sum += a[k];
			}
			max = Math.max(sum, max);
		}
		System.out.println(max);
	}
}
