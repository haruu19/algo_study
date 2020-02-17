import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S2005 {
	static int N;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int TC = sc.nextInt();
		for(int t=1;t<=TC;t++) {
			System.out.println("#"+t);
			N = sc.nextInt();
			int[] a = new int[N];
			a[0]=1;
			method(1,a);
		}
	}
	static void method(int idx, int[] a) {
		if(idx>N)
			return;
		for(int i=0;i<idx;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		int[] b = new int[N];
		b[0] = 1;
		for(int i=1;i<N-1;i++) {
			b[i] = a[i-1]+a[i];
		}
		b[N-1] = 1;
		method(idx+1,b);
	}
}
