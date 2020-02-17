import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1288 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int s = N;
			int cnt = 1;
			int[] c = new int[10];
			boolean flag;
			LOOP:
			while(true) {
				flag = true;
				String temp = Integer.toString(N);
//				System.out.println(temp);
				char[] ch = temp.toCharArray();
				for(int i=0;i<ch.length;i++) {
					c[ch[i]-48]++;
				}
				for(int i=0;i<10;i++) {
					if(c[i]==0) {
						break;
					}
					if(i==9)
						break LOOP;
				}
				N+=s;
				cnt++;
			}
//			int a = '1' - 48;
			
			System.out.println("#"+t+" "+cnt);
		}
	}
	
}