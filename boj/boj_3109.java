import java.util.Scanner;

public class boj_3109 {
	static int R;
	static int C;
	static char[][] a;
	static int ans;
	static int[] d= {-1,0,1};
	static boolean flag;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		sc.nextLine();
		a = new char[R][C];
		for(int i=0;i<R;i++) {
			String s = sc.nextLine();
			a[i] = s.toCharArray();
		}
		for(int i=0;i<R;i++) {
			flag = false;
			dfs(i,1);
		}

		System.out.println(ans);
	}
	static void dfs(int idx, int depth) {
		if(depth==C) {
			flag = true;
			ans++;
			return;
		}
		for(int k=0;k<3;k++) {
			if(flag)
				return;
			if(isOut(idx-1+k)||a[idx-1+k][depth]=='x')
				continue;
			a[idx-1+k][depth]='x';
			dfs(idx-1+k,depth+1);
		}
	}
	static boolean isOut(int x) {
		return (x<0||x>=R);
	}
}
