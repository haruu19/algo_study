package im;

import java.util.Arrays;
import java.util.Scanner;

public class boj2798BlackJack {
	static int N;
	static int M;
	static int[] a;
	static int[] card;
	static boolean[] v;
	static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[N];
		for(int i=0;i<N;i++)
			a[i] = sc.nextInt();
		card = new int[3];
		v = new boolean[N];
		Arrays.sort(a);
		method(0,0,-1);
		System.out.println(max);
	}
	static void method(int sum, int depth, int prev) {
		if(depth==3) {
			System.out.println();
			if(sum<=M) {
				max = Math.max(sum, max);
			}
			return;
		}
		for(int i=0;i<N;i++) {
			if(i<=prev)
				continue;
			method(sum+a[i],depth+1,i);
		}
	}
}
