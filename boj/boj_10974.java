import java.util.Arrays;
import java.util.Scanner;

public class boj_10974 {
	static int N;
	static int r;
	static boolean[] v;
	static int[] map;
	static int[] data;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		r = sc.nextInt();
		
		map = new int[N];
		for(int i=0;i<N;i++)
			map[i]=i+1;
		data = new int[r];
		v= new boolean[N+1];
//		perm(N,r,0);
		perm(0);
	}
//	static void perm(int depth) {
//		if(depth==N) {
//			for(int i=0;i<N;i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
//			return;
//		}
//		for(int i=1;i<=N;i++) {
//			if(v[i])
//				continue;
//			v[i]=true;
//			a[depth]=i;
//			perm(depth+1);
//			v[i]=false;
//		}
//	}
	
	static void swap(int i, int j) {
		int temp;
		temp = map[i];
		map[i] = map[j];
		map[j] = temp;
	}
	
	static void perm(int k) {
		if(k==r) {
			for(int i=0;i<r;i++) {
				System.out.print(map[i]+" ");
			}
			System.out.println();
		}
		for(int i=k;i<map.length;i++) {
			swap(i,k);
			perm(k+1);
			swap(k,i);
		}
	}
	
	static void perm(int n, int r, int level) {
		if(level==r) {
			for(int i=0;i<data.length;i++) {
				System.out.print(data[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<map.length;i++) {
			if(!v[i]) {
				v[i]=true;
				data[level]=map[i];
				perm(n,r,level+1);
				v[i]=false;
			}
		}
	}
}
