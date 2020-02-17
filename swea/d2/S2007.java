import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S2007 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int TC = sc.nextInt();
		for(int t=1;t<=TC;t++) {
			String s = sc.next();
			char[] charr = s.toCharArray();
			for(int i=0;i<charr.length;i++) {
				int cnt = 0;
				boolean flag = false;
				int x = 0;
				int y = 0;
				x = i;
				y = i+1+i;
				while(x>=0) {
					if(charr[x]!=charr[y])
						flag = true;
					x--;
					y--;
				}
				if(flag==false) {
					System.out.println("#"+t+" "+(i+1));
					break;
				}
					
			}
		}
	}
}
