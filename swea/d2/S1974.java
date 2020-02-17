import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class S1974 {

	static int[] ss = {0,3,6};
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		LOOP:
		for(int t=1;t<=T;t++) {
			boolean flag = true;
			int[][] a = new int[9][9];
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			boolean[] check = new boolean[10];
			//1. 가로세로 검사
			LOOP1:
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					check[a[i][j]] = true;
				}
				
				for(int k=1;k<=9;k++) {
					if(!check[k]) {
						flag = false;
						break LOOP1;
					}
				}
				Arrays.fill(check, false);
			}
			LOOP2:
			for(int j=0;j<9;j++) {
				for(int i=0;i<9;i++) {
					check[a[i][j]] = true;
				}
				
				for(int k=1;k<=9;k++) {
					if(!check[k]) {
						flag = false;
						break LOOP2;
					}
				}
				Arrays.fill(check, false);
			}

			//2. 3x3 검사
			LOOP3:
			for(int c1=0;c1<3;c1++) {
				for(int c2=0;c2<3;c2++) {
					int sum = 0;
					for(int i=ss[c1];i<ss[c1]+3;i++) {
						for(int j=ss[c2];j<ss[c2]+3;j++) {
							//체크.
							sum+=a[i][j];
						}
					}
					if(sum!=45) {
						flag = false;
						break LOOP3;
					}
					sum = 0;
				}
			}

			
			
			if(flag) {
				System.out.println("#"+t+" "+1);
			}else {
				System.out.println("#"+t+" "+0);
			}
		}
	}
}
