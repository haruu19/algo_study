package im;

import java.util.Scanner;

public class boj2578 {
	static int[][] a;
	static int k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		a = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int temp;
		for(k=1;k<=25;k++) {
			temp = sc.nextInt();
			LOOP:
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(a[i][j]==temp) {
						a[i][j]=0;
						if(check()>=3) {
							System.out.println(k);
							return;
						}
						break LOOP;
					}
				}
			}
		}
	}
	static int check() {
		int result = 0;
		int i=0;
		int j=0;
		//가로세로 빙고여부
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(a[i][j]!=0)
					break;
			}
			if(j==5)
				result++;
		}
		for(j=0;j<5;j++) {
			for(i=0;i<5;i++) {
				if(a[i][j]!=0)
					break;
			}
			if(i==5)
				result++;
		}
		//대각선 빙고여부
		for(i=0;i<5;i++) {
			if(a[i][i]!=0)
				break;
		}
		if(i==5)
			result++;
		for(i=0;i<5;i++) {
			if(a[4-i][i]!=0)
				break;
		}
		if(i==5)
			result++;
		return result;
	}
}
