package im;

import java.util.Scanner;

public class boj2567 {
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int T,x,y;
	static int[][] a = new int[102][102];
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			x = sc.nextInt();
			y = sc.nextInt();
			for(int i=x;i<=x+9;i++) {
				for(int j=y;j<=y+9;j++) {
					a[i][j]=1;
				}
			}
		}
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=100;j++) {
				if(a[i][j]==1)
					method(i,j);
			}
		}
		System.out.println(count);
	}
	//사방위 탐색 도중 주위 4곳이 모두 자기와 같으면 그 즉시 종료(내부로 들어왔기 때문)
	static void method(int x, int y) {
		int nx,ny;
		for(int i=0;i<4;i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			if(a[nx][ny]!=a[x][y]) {
				count++;
			}
		}
		return;
	}
}
