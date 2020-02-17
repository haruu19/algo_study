package jungol;

import java.util.Scanner;

public class jo1169dice {
	static int N,M;
	static int[] a;
	static boolean[] v;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[N];
		v = new boolean[6+1];
//		dfs(0,0);
		dfs2(0);
	}
	static void dfs(int depth, int max) {
		if(depth==N) {
			for(int i=0;i<N;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			return;
		}
		for(int i=1;i<=6;i++) {
			if(max>i)
				continue;
			a[depth]=i;
			dfs(depth+1,i);
		}
	}
	static void dfs2(int depth) {
		if(depth==N) {
			for(int i=0;i<N;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			return;
		}
		for(int i=1;i<=6;i++) {
			if(v[i])
				continue;
			a[depth]=i;
			v[i] = true;
			dfs2(depth+1);
//			v[i] = false;
		}
	}
}
