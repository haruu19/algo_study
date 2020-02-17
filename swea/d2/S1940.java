import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1940 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int as = 0;//가속도
			int n,m;
			int sum = 0;
			for(int i=0;i<N;i++) {
				n = sc.nextInt();
				switch(n) {
				case 1:
					m = sc.nextInt();
					as += m;
					sum += as;
					break;
				case 2:
					m = sc.nextInt();
					as -= m;
					if(as<0)
						as = 0;
					sum += as;
					break;
				case 0:
					sum += as;
				}
			}
			System.out.println("#"+t+" "+sum);
		}
	}
}