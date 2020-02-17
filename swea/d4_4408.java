import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class d4_4408 {
	static int[] room = new int[201];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			Arrays.fill(room, 0);
			for(int i=0;i<N;i++) {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				if(n1>n2) {
					int temp = n1;
					n1 = n2;
					n2 = temp;
				}
				
				n1 = (n1+1)/2;
				n2 = (n2+1)/2;

				for(int j=n1;j<=n2;j++) {
					room[j]++;
				}
			}
			int max = 0;
			for(int i=1;i<=200;i++) 
				max = Math.max(max, room[i]);
			System.out.println("#"+t+" "+max);
		}
	}
}
