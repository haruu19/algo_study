import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class S5215{
    static int answer;
    static int N,L;
    static int[] trace;
    static int max;
    static int count=0;
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(new FileInputStream("input.txt"));
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            N = sc.nextInt();
            L = sc.nextInt();
            int[][] a = new int[N][2];
            for(int i=0;i<N;i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
//            int[] d = new
            boolean[] v = new boolean[N];
            max = Integer.MIN_VALUE;
            trace = new int[N];
            dfs(a,0,0,0);
            System.out.println(count);
            System.out.println("#"+t+" "+max);
        }
    }
    
    static int dfs(int[][] a, int tSum, int kSum, int depth) {
    	if(depth==N) {
    		count++;
    		if(kSum<=L) {
    			max = Math.max(tSum, max);
    		}
    		return 0;
    	}
    	for(int i=depth;i<N;i++) {
    		dfs(a,tSum,kSum,depth+1);
    		if(kSum+a[i][0]>L) {
    			int x = 
    		}
    		tSum+=a[i][0];
    		kSum+=a[i][1];

    		dfs(a,tSum,kSum,depth+1);
    	}
    }
}
