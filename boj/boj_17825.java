import java.util.Arrays;
import java.util.Scanner;

public class boj_17825 {

	static int[][] jump = new int[33][6];
	
	public static void main(String[] args) {
		jump = 
		{
			{0,1,2,3,4,5},
			{2,2,3,4,5,9},
			{4,3,4,5,9,10},
			{6,4,5,9,10,11},
			{8,5,9,10,11,12},
			{10,6,7,8,20
		}
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[10];
		for(int i=0;i<10;i++)
			dice[i]=sc.nextInt();
		Arrays.sort(dice);
//		perm();
	}
	static void perm() {
		
	}
}
