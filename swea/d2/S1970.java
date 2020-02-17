import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1970 {

	static int[] ss = {50000,10000,5000,1000,500,100,50,10};
	static int[] cnt = new int[8];
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int don = sc.nextInt();
			int a;
			int b;
			for(int i=0;i<8;i++) {
				cnt[i] = don / ss[i];
				don = don % ss[i];
			}
			
			System.out.println("#"+t);
			for(int num : cnt) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}