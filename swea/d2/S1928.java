import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.util.Scanner;

public class S1928 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			String encoded = sc.next();
			String decoded = new String(Base64.getDecoder().decode(encoded));
			System.out.print("#"+t+" ");
			System.out.println(decoded);
		}
	}
}