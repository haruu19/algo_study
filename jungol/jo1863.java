package jungol;

import java.util.Scanner;

public class jo1863 {
	static int[] p;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		p = new int[N+1];
		for(int i=1;i<=N;i++)
			p[i]=i;
		for(int i=0;i<M;i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			union(n1,n2);
		}
		int ans = 0;
		int[] count = new int[N+1];
		for(int i=1;i<=N;i++)
			if(p[i]==i)
				ans++;
		System.out.println(ans);
	}
	static int findSet(int x) {
		if(p[x]==x) {
			return x;
		}else {
			return p[x] = findSet(p[x]);
		}
	}
	
	static void union(int x, int y) {
		x = findSet(x);
		y = findSet(y);
		if(x==y) {
			return;
		}else {
			p[y] = x;
		}
	}
}
