import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_17135 {
	static class Enemy{
		int x;
		int y;
		int distance;
		Enemy(int x, int y, int distance){
			this.x = x;
			this.y = y;
			this.distance = distance;
		}

	}
	static int[] dx = {0,-1,0};
	static int[] dy = {-1,0,1};
	static int[][] map;
	static int[][] copyOfMap;
	static boolean[][] v;
	static int N,M,D;
	static int ans;
	static int sum;
	static boolean[] archor;
	static ArrayList<Enemy> pyosik;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		D = sc.nextInt();
		map = new int[N+1][M+1];

		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		archor = new boolean[M+1];
		comb(0,0);
		System.out.println(ans);
	}
	
	static void comb(int prev, int cnt) {
		if(cnt == 3) {
			sum = 0;
			play();
			ans = Math.max(ans, sum);
			return;
		}
		
		for(int i=1;i<=M;i++) {
			if(i<=prev)
				continue;
			archor[i] = true;
			comb(i,cnt+1);
			archor[i] = false;
		}
	}
	
	static void play() {
		//게임진행
		int cnt = 1;
		copyOfMap = new int[N+1][M+1];
		for(int i=1;i<=N;i++)
			copyOfMap[i] = map[i].clone();
		while(true) {
			if(isClear())
				break;
			v = new boolean[N+1][M+1];
			pyosik = new ArrayList<>();
			for(int i=1;i<=M;i++)
				if(archor[i])
					kill(i);//적을 죽인다
			Iterator<Enemy> it = pyosik.iterator();
			while(it.hasNext()) {
				Enemy e = it.next();
				if(copyOfMap[e.x][e.y]!=0) {
					copyOfMap[e.x][e.y]=0;
					sum++;
				}
			}
			for(int i=N;i>=1;i--)
				copyOfMap[i] = Arrays.copyOf(copyOfMap[i-1], M+1);
			for(int i=1;i<=cnt;i++)
				Arrays.fill(copyOfMap[i], 0);
			cnt++;
		}
	}
	
	static void kill(int idx) {//bfs 로 접근
		Queue<Enemy> enemy = new LinkedList<>();
		int distance = 1;
		enemy.offer(new Enemy(N, idx, distance));
		while(!enemy.isEmpty()) {
			Enemy e = enemy.poll();
			if(e.distance>D)
				break;
//			v[e.x][e.y] = true; // 중복제거 조건을 없애줬더니 통과했다
			if(copyOfMap[e.x][e.y]==1) {
//				copyOfMap[e.x][e.y]=0;
//				sum++;
				pyosik.add(new Enemy(e.x, e.y, e.distance));
				break;
			}
			int nx,ny;
			for(int i=0;i<3;i++) {
				nx = e.x + dx[i];
				ny = e.y + dy[i];
				if(isOut(nx,ny))
					continue;
				enemy.offer(new Enemy(nx,ny,e.distance+1));
			}
		}
	}
	
	static boolean isOut(int x, int y) {
		return (x<1||x>N||y<1||y>M);
	}
	
	static boolean isClear() {
		for(int i=1;i<=N;i++)
			for(int j=1;j<=M;j++)
				if(copyOfMap[i][j]!=0)
					return false;
		return true;
	}
}
