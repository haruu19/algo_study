package nm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bojnm15650 {
	static int N,M;
	static int[] ans;
	static boolean[] v;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] t = s.split(" ");
		int[] a = new int[t.length];
		for(int i=0;i<t.length;i++) {
			a[i] = Integer.parseInt(t[i]);
		}
		N = a[0];
		M = a[1];
		ans = new int[M];
		v = new boolean[N+1];
		
		dfs(0,0);
	}
	static void dfs(int depth,int prev) {
		if(depth==M) {
			for(int i=0;i<M;i++)
				System.out.print(ans[i]+" ");
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(i<=prev)
				continue;
			ans[depth]=i;
			dfs(depth+1,i);
		}
	}
}
