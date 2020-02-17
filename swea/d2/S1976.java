import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1976 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		int h1,h2,m1,m2;
		int h3,m3;
		for(int t=1;t<=T;t++) {
			h1 = sc.nextInt();
			m1 = sc.nextInt();
			h2 = sc.nextInt();
			m2 = sc.nextInt();
			
			h3 = h1+h2;
			m3 = m1+m2;
			if(m3>=60) {
				h3++;
				m3 -=60;
			}
			if(h3>12) {
				h3-=12;
			}
			System.out.println("#"+t+" "+h3+" "+m3);
		}
	}
}
