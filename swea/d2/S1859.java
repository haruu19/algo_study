import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class S1859 {

	public static void main(String[] args) throws FileNotFoundException {
		// 뒤에서부터 최댓값 찾기
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int test_case=1;test_case<=TC;test_case++) {
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			for(int i=0;i<N;i++) a[i] = sc.nextInt();
			int max = 0;
			int sum = 0;
			for(int i=N-1;i>=0;i--) {
				if(Math.max(max, a[i])==a[i])
					max=a[i];
					b[i]=max;
			}
			for(int i=N-1;i>=0;i--) {
				sum += b[i] - a[i];
			}
			System.out.println("#"+test_case+" "+sum);
		}
	}
}
