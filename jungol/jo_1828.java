package jungol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class jo_1828 {
	static class Ref{
		int x;
		int y;
		Ref(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	static int[][] a;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Ref> ref = new ArrayList<>();
		for(int i=0;i<N;i++)
			ref.add(new Ref(sc.nextInt(),sc.nextInt()));
		//최고온도 기준 정렬
		Collections.sort(ref, new Comparator<Ref>() {
			@Override
			public int compare(Ref o1, Ref o2) {
				// TODO Auto-generated method stub
				return o1.y-o2.y;
			}		
		});
		//최고온도 포함 화학물질 삭제
		int size = ref.size();
		while(size!=0) {
			int t = ref.get(0).y;
			Iterator<Ref> it = ref.iterator();
			while(it.hasNext()) {
				Ref temp = it.next();
				if(temp.x<=t && temp.y>=t)
					it.remove();
			}
			size = ref.size();
			ans++;
		}
		
		System.out.println(ans);
	}
}
