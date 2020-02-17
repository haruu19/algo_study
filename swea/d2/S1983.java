import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S1983 {

	static String[] aa = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
	
	public static class Score implements Comparable<Score>{

		int sum;
		int idx;
		
		public Score(int sum, int idx) {
			this.sum = sum;
			this.idx = idx;
		}
		
		public double getSum() {
			return sum;
		}
		
		@Override
		public int compareTo(Score o) {
			// TODO Auto-generated method stub
			return (int)(o.getSum() - getSum());
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int a,b,c;
//			double[] sum = new double[N];
//			Score[] s = new Score[N];
			
			Integer aaa[] = new Integer[N];
			
			
			List<Score> s = new ArrayList<>();
			for(int i=0;i<N;i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				s.add(new Score(35*a + 45*b + 20*c, i));
				aaa[i] = 35*a + 45*b + 20*c;
			}
			
			int k_score = aaa[K-1];
			Arrays.sort(aaa,Collections.reverseOrder());
			int k_rank = Arrays.asList(aaa).indexOf(k_score);
			System.out.format("#%d %s\n", t, aa[10*k_rank/N]);
			
//			Collections.sort(s);
//			int idx = 0;
//			for(int i=0;i<N;i++) {
//				if(s.get(i).idx==K) {
//					idx = i;
//					break;
//				}
//			}
//			idx = (int)(idx/(N/10));
//			System.out.println("#"+t+" "+ aa[idx]);
		}
	}
}
