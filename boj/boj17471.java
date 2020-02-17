import java.util.Scanner;

public class boj17471 {
	static int[] p;
	static int[][] a;
	static boolean[] team;
	static int N;
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		p = new int[N+1];
		for(int i=1;i<=N;i++)
			p[i]=sc.nextInt();
		a=new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			int n = sc.nextInt();
			for(int j=0;j<n;j++) {
				int m = sc.nextInt();
				a[i][m] = 1;
				a[m][i] = 1;
			}
		}
		team = new boolean[N+1];
		method(1);
		if(ans == Integer.MAX_VALUE) 
			System.out.println("-1");
		else
			System.out.println(ans);
	}
	
	static void dfs(int idx, boolean chk, boolean[] v) {
		v[idx]=true;
		for(int i=1;i<=N;i++) {
			if(a[idx][i]==1&&team[i]==chk&&!v[i]) {
				dfs(i,chk,v);
			}
		}
	}
	
	static boolean isLinked(boolean chk) {
		boolean[] v = new boolean[N+1];
		for(int i=1;i<=N;i++) {
			if(team[i]==chk) {
				dfs(i,chk,v);
				break;
			}
		}
		for(int i=1;i<=N;i++) {
			if(team[i]==chk) {
				if(!v[i])
					return false;
			}
		}
		return true;
	}
	static void method(int idx) {
		if(idx==N+1) {
			boolean flag = false;
			for(int i=1;i<N;i++) {
				if(team[i]!=team[i+1]) {
					flag = true;
					break;
				}
			}
			if(!flag)
				return;
			if(isLinked(true)&&isLinked(false))
				ans = Math.min(ans, solve());
			return;
		}
		team[idx]=true;
		method(idx+1);
		team[idx]=false;
		method(idx+1);
	}
	static int solve() {
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=N;i++) {
			if(team[i]) {
				sum1+=p[i];
			}else {
				sum2+=p[i];
			}
		}
		return Math.abs(sum1-sum2);
	}
}
