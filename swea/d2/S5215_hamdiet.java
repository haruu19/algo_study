import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S5215_hamdiet {
	static int N,L;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int TC = sc.nextInt();
		for(int t=1;t<=TC;t++) {
			System.out.print("#"+t+" ");
			N = sc.nextInt();
			L = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			for(int i=0;i<N;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			boolean[] v = new boolean[N];
			
			dfs(a,b,v,0);
		}
	}
	static void dfs(int[] a, int[] b, boolean[] v,int idx) {
		//실행코드
		v[idx]=true;
		//재귀
		for(int i=0;i<N;i++) {
			if(v[i])
				continue;
			dfs(a,b,v,i);
		}
	}
}