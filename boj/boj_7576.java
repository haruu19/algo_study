import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_7576 {
	static int M,N;
	static int[][] a;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static boolean[][] cur;//현재 처리할 토마토 체크
	
	static class Tomato{
		int x;
		int y;
		int time;
		Tomato(int x, int y, int time){
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		a = new int[N][M];
		cur = new boolean[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				a[i][j]=sc.nextInt();
				if(a[i][j]==1)
					cur[i][j]=true;
			}
		}
		int cnt = -1;
		int ans = 0;
		Queue<Tomato> tomato = new LinkedList<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(a[i][j]==1) 
					tomato.offer(new Tomato(i,j,cnt));
			}
		}
		while(!tomato.isEmpty()) {
			Tomato t = tomato.poll();
			int nx,ny;
			cnt = t.time + 1;
			for(int i=0;i<4;i++) {
				nx = t.x + dx[i];
				ny = t.y + dy[i];
				if(isOut(nx,ny)||a[nx][ny]!=0)
					continue;
				tomato.offer(new Tomato(nx,ny,cnt));
				a[nx][ny]=1;
			}
		}
		
		if(!hasNoZero()) {
			System.out.println("-1");
		}else
			System.out.println(cnt);
	}
	
	static boolean isOut(int x, int y) {
		return (x<0||x>=N||y<0||y>=M);
	}
	
	static boolean hasNoZero() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(a[i][j]==0)
					return false;
			}
		}
		return true;
	}
}
