import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1984 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int[] a = new int[10];
			for(int i=0;i<10;i++)
				a[i] = sc.nextInt();
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			float result = 0;
			int cnt = 0;
			for(int i=0;i<10;i++) {
				if(a[i]<min)
					min = a[i];
				if(a[i]>max)
					max = a[i];
			}
			for(int i=0;i<10;i++) {
				if(!(a[i]==min||a[i]==max)) {
					result+=a[i];
					cnt++;
				}
			}
			result /= cnt;
			System.out.println("#"+t+" "+Math.round(result));
		}
	}
}
