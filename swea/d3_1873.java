import java.util.Arrays;
import java.util.Scanner;

public class d3_1873 {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static char[][] map;
	static int H;
	static int W;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			H = sc.nextInt();
			W = sc.nextInt();
			map = new char[H][W];
			sc.nextLine();
			for(int i=0;i<H;i++) {
				String s = sc.nextLine();
				map[i] = s.toCharArray();
			}
			int N = sc.nextInt();
			sc.nextLine();
			char[] a = new char[N];
			String s = sc.nextLine();
			a = s.toCharArray();
			for(int i=0;i<N;i++)
				method(a[i]);
			
			System.out.print("#"+t+" ");
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	static int[] find() {
		int[] result = new int[2];
		LOOP:
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(map[i][j]=='^'||map[i][j]=='v'||map[i][j]=='<'||map[i][j]=='>') {
					result[0] = i;
					result[1] = j;
					break LOOP;
				}
			}
		}
		return result;
	}
	
	static boolean isOut(int x, int y) {
		boolean result = false;
		if(x<0||x>=H||y<0||y>=W)
			result = true;
		return result;
	}
	
	static int getDirection(char ch) {
		int result = -1;
		if(ch=='^')
			result = 0;
		if(ch=='v')
			result = 1;
		if(ch=='<')
			result = 2;
		if(ch=='>')
			result = 3;
		return result;
	}
	
	static void method(char op) {
		int x,y;
		int nx,ny;
		x = find()[0];
		y = find()[1];
		switch(op) {
		case 'U':
			map[x][y] = '^';
			nx = x + dx[0];
			ny = y + dy[0];
			if(!isOut(nx,ny)&&map[nx][ny]=='.') {
				char temp = map[x][y];
				map[x][y] = map[nx][ny];
				map[nx][ny] = temp;
			}
			break;
		case 'D':
			map[x][y] = 'v';
			nx = x + dx[1];
			ny = y + dy[1];
			if(!isOut(nx,ny)&&map[nx][ny]=='.') {
				char temp = map[x][y];
				map[x][y] = map[nx][ny];
				map[nx][ny] = temp;
			}
			break;
		case 'L':
			map[x][y] = '<';
			nx = x + dx[2];
			ny = y + dy[2];
			if(!isOut(nx,ny)&&map[nx][ny]=='.') {
				char temp = map[x][y];
				map[x][y] = map[nx][ny];
				map[nx][ny] = temp;
			}
			break;
		case 'R':
			map[x][y] = '>';
			nx = x + dx[3];
			ny = y + dy[3];
			if(!isOut(nx,ny)&&map[nx][ny]=='.') {
				char temp = map[x][y];
				map[x][y] = map[nx][ny];
				map[nx][ny] = temp;
			}
			break;
		case 'S':
			int dir = getDirection(map[x][y]);
			while(true) {
				nx = x + dx[dir];
				ny = y + dy[dir];
				if(isOut(nx,ny))
					break;
				if(map[nx][ny] == '*') {
					map[nx][ny] = '.';
					break;
				}
				if(map[nx][ny] == '#')
					break;
				x = nx;
				y = ny;
			}
			break;
		}
	}
}
