import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			
			
			
			System.out.println("#"+t+" ");
		}
	}
	
}