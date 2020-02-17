package swea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class d4_1258 {
	static int[] dx = {1,0};
	static int[] dy = {0,1};
	static int[][] a;
	static boolean[][] v;
	static int N;
	static int[] HW = new int[2];
	static class Rec implements Comparable<Rec>{
		int h;
		int w;
		int size;
		public Rec(int h, int w, int size) {
			this.h = h;
			this.w = w;
			this.size = size;
		}
		@Override
		public int compareTo(Rec o) {
			if(this.size<o.size) {
				return -1;
			}else if(this.size>o.size) {
				return 1;
			}else {
				return this.h-o.h;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			N = sc.nextInt();
			a = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			v = new boolean[N][N];
			ArrayList<Rec> rec = new ArrayList<>();
			int count = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(a[i][j]!=0&&!v[i][j]) {
						method(i,j,rec);
						count++;
					}
				}
			}

			Collections.sort(rec);
			System.out.print("#"+t+" "+count+" ");
			for(int i=0;i<rec.size();i++) {
				System.out.print(rec.get(i).h+" "+rec.get(i).w+" ");
			}
			System.out.println();
		}
	}
	static void method(int x, int y, ArrayList<Rec> rec) {
		int nx, ny;
		HW[0]=1;
		HW[1]=1;
		for(int i=0;i<=1;i++) {
			nx = x;
			ny = y;
			while(true) {
				nx = nx + dx[i];
				ny = ny + dy[i];
				if(isOut(nx,ny)||a[nx][ny]==0)
					break;
				HW[i]++;
			}
		}
		for(int i=x;i<x+HW[0];i++) {
			for(int j=y;j<y+HW[1];j++) {
				v[i][j] = true;
			}
		}
		rec.add(new Rec(HW[0],HW[1],HW[0]*HW[1]));
	}
	static boolean isOut(int x, int y) {
		return (x<0||x>=N||y<0||y>=N);
	}
}
