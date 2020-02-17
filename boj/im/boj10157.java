package im;

import java.util.Scanner;

public class boj10157 {
	static int C,R,K;
	static int[] dx= {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] a;
	static boolean[][] v;
	static int idx;
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		R = sc.nextInt();
		K = sc.nextInt();
		a = new int[R+2][C+2];
		v = new boolean[R+2][C+2];
		int x,y,nx,ny;
		x=1;
		y=1;
		cnt = 1;
		a[x][y]=1;
		v[x][y]=true;
		while(true) {
			if(cnt==R*C)
				break;
			nx = x + dx[idx];
			ny = y + dy[idx];
			if(isOut(nx,ny)||v[nx][ny]) {
				idx = (idx+1)%4;
				continue;
			}
			cnt++;
			a[nx][ny]=cnt;
			v[nx][ny]=true;
			x=nx;
			y=ny;
		}
		
		if(K>R*C) {
			System.out.println(0);
		}else {
			for(int i=1;i<=R;i++) {
				for(int j=1;j<=C;j++) {
					if(a[i][j]==K)
						System.out.println(j+" "+i);
				}
			}
		}
	}
	static boolean isOut(int x, int y) {
		if(x==0||x==R+1||y==0||y==C+1)
			return true;
		return false;
	}
}
