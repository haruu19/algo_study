package nm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bojnm15651 {
	static int N,M;
	static int[] ans;
	static boolean[] v;
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
		
		dfs(0);
	}
	static void dfs(int depth) throws IOException {
		if(depth==M) {
			for(int i=0;i<M;i++)
				bw.write(ans[i]+" ");
			bw.newLine();
			bw.flush();
			return;
		}
		for(int i=1;i<=N;i++) {
			ans[depth]=i;
			dfs(depth+1);
		}
	}
}
