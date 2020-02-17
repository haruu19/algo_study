import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1979 {

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int answer=0;	
	static int N,K;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			answer=0;
			N = sc.nextInt();
			K = sc.nextInt();
			int[][] a = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			method(a);
			System.out.println("#"+t+" "+answer);
		}
	}

	static void method(int[][] a) {
		//가로
		for(int i=0;i<N;i++) {
			//가로줄 쭉 가다가 1 발견하면 K번째까지 1이 있는지, K+1번째는 0인지 확인한다
			//K+1번째가 0이면 answer++, 1이면 0나올때까지 j++
			//K+2번째부터 위와같이 계속 찾는다
			LOOP:
			for(int j=0;j<N;j++) {
				if(a[i][j]==1) {
					boolean flag = true;
					for(int k=0;k<K-1;k++) {
						j++;
						if(j>=N)
							break LOOP;
						if(a[i][j]==0) {
							flag = false;
							break;
						}
					}
					if(flag) {
						j++;
						if(j>=N) {
							answer++;
							break LOOP;
						}
						if(a[i][j]==0) {
							answer++;
						}
						if(a[i][j]==1) {
							while(true) {
								j++;
								if(j>=N||a[i][j]==0)
									break;
							}
						}
					}
				}
			}
		}
		//세로
		for(int j=0;j<N;j++) {
			//세로줄 쭉 가다가 1 발견하면 K번째까지 1이 있는지, K+1번째는 0인지 확인한다
			//K+1번째가 0이면 answer++, 1이면 0나올때까지 j++
			//K+2번째부터 위와같이 계속 찾는다
			LOOP:
			for(int i=0;i<N;i++) {
				if(a[i][j]==1) {
					boolean flag = true;
					for(int k=0;k<K-1;k++) {
						i++;
						if(i>=N)
							break LOOP;
						if(a[i][j]==0) {
							flag = false;
							break;
						}
					}
					if(flag) {
						i++;
						if(i>=N) {
							answer++;
							break LOOP;
						}
						if(a[i][j]==0) {
							answer++;
						}
						if(a[i][j]==1) {
							while(true) {
								i++;
								if(i>=N||a[i][j]==0)
									break;
							}
						}
					}
				}
			}
		}
	}
}
