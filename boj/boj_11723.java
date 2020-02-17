import java.util.Scanner;

public class boj_11723 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		sc.nextLine();
		int check = 1 << 20;
		int n=0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			String s = sc.next();
			switch(s) {
			case "add":
				n = Integer.parseInt(sc.next());
				check = check | (1 << n-1);
				break;
			case "check":
				n = Integer.parseInt(sc.next());
				if((1 << n-1 & check) ==0) {
					sb.append("0\n");
				}else {
					sb.append("1\n");
				}
//				System.out.println((1 << n-1) & check);
				break;
			case "remove":
				n = Integer.parseInt(sc.next());
				check = check & ~(1 << n-1);
				break;
			case "toggle":
				n = Integer.parseInt(sc.next());
				if(((1 << n-1) & check) == 0) {
					check = check | (1 << n-1);
				}else {
					check = check & ~(1 << n-1);
				}
				break;
			case "all":
				check = check | ~(1<<20);
				break;
			case "empty":
				check = 1 << 20;
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
