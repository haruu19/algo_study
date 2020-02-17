package swea;

import java.util.Arrays;
import java.util.Scanner;

public class d3_1244 {
	static int[] a ;
	static int cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			sc.nextLine();
			String s = sc.next();
			char[] temp = s.toCharArray();
			a = new int[temp.length];
			for(int i=0;i<a.length;i++)
				a[i] = temp[i] - 48;
			cnt= sc.nextInt();
			dfs(0,0);
		}
	}
	
	static void dfs(int prev, int depth) {
		if(depth==cnt) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<a.length;i++)
				sb.append(a[i]);
			
			return;
		}
		for(int i=prev;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(i==j)
					continue;
				swap(i,j);
				dfs(i,depth+1);
				swap(i,j);
			}
		}
	}
	
	
	
	
	static void swap(int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
