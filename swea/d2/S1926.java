import java.util.Scanner;

public class S1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=1;i<=N;i++) {
			method(i,false,i);
			System.out.print(" ");
		}
	}
	static void method(int i, boolean flag,int n) {
		if(i==0&&flag==false) {
			System.out.print(n);
			return;
		}
		if(i==0&&flag==true)
			return;
		if((i%10)%3==0&&(i%10)!=0) {
			flag = true;
			System.out.print("-");
		}
		method(i/10,flag,n);
	}
}
