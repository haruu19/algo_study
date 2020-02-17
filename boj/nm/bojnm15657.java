package nm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bojnm15657 {
	static int N,M;
	static int[] ans;
	static boolean[] v;
	static BufferedWriter bw;
	static int[] arr;
	static int save2;
	static int[] save;
//	static int[] cnt = new int[10001];
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
		save = new int[M];
		s = br.readLine();
		t = s.split(" ");
		arr = new int[N];
		for(int i=0;i<N;i++) {
//			cnt[Integer.parseInt(t[i])]++;
			arr[i] = Integer.parseInt(t[i]);
		}
		Arrays.sort(arr);
		dfs(0,-1);
	}
	static void dfs(int depth, int prev) throws IOException {
		if(depth==M) {
			boolean flag=true;
			for(int i=0;i<M;i++) {
				if(save[i]!=ans[i])
					flag = false;
			}	
			if(flag)
				return;
			for(int i=0;i<M;i++)
				save[i]=ans[i];
			for(int i=0;i<M;i++)
				bw.write(ans[i]+" ");
			bw.newLine();
			bw.flush();
			return;
		}
		boolean flag2=true;
		if(save2!=arr[depth])
			flag2=false;
		if(flag2)
			return;
		save2=arr[depth];
		for(int i=0;i<N;i++) {
			if(v[i])
				continue;
			v[i]=true;
			ans[depth]=arr[i];
			dfs(depth+1,i);
			v[i]=false;
		}
	}
}
