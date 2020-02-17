import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1989 {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			String str = sc.next();
			int end = str.length();
			char[] crr = str.toCharArray();
			int middle = (0+end)/2;
			boolean flag = true;

			for(int i=0;i<middle;i++) {
				if(crr[i]!=crr[end-1-i]) {
					flag = false;
					break;
				}
			}
			System.out.print("#"+t+" ");
			if(flag) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}

}
