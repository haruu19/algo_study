import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class S1966 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int[] a = new int[N];
			for(int i=0;i<N;i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			System.out.print("#"+t+" ");
			for(int n : a) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}