import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S2001 {
	static int N,M;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int TC = sc.nextInt();
		for(int t=1;t<=TC;t++) {
			N = sc.nextInt();
			M = sc.nextInt();
			int[][]a = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			int sum;
			for(int x=0;x<=N-M;x++) {
				for(int y=0;y<=N-M;y++) {
					sum = 0;
					for(int i=x;i<x+M;i++) {
						for(int j=y;j<y+M;j++) {
							sum+=a[i][j];
						}
					}
					max = Math.max(max, sum);
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}
}
