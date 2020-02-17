import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class S1986 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int result=0;
			int N = sc.nextInt();
			
			for(int i=1;i<=N;i++) {
				if(i%2==0) 
					result-=i;
				else
					result+=i;
			}
			
			System.out.println("#"+t+" "+result);
		}
	}
}
