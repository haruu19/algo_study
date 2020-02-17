package im;

import java.util.Scanner;

public class boj1244 {

	static int n;
	static int[] a;
	static int sNum;
	static int s;
	static int idx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		sNum=sc.nextInt();
		for(int i=1;i<=sNum;i++) {
			
			s=sc.nextInt();
			idx=sc.nextInt();
			
			if(s==1) {//남자
				for(int k=1;k<=n;k++) {
					if(k%idx==0)
						change(k);
				}
				
			}else {//여자
				change(idx);
				int n1 = idx-1;
				int n2 = idx+1;
				while(true) {
					if(n1<1||n2>n)
						break;
					if(a[n1]!=a[n2]) {
						break;
					}
					change(n1);
					change(n2);
					n1--;
					n2++;
				}
			}
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(a[i]+" ");
			if(i%20==0)
				System.out.println();
		}
	}
	static void change(int k) {
		if(a[k]==0) {
			a[k] = 1;
		}else {
			a[k] = 0;
		}
	}
}
