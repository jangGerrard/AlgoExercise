package kr.ac.kw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//public class RipenTomato {
//	static int[][] box;
//	static int[][] res;
//	static int ripenCount = 0 ;
//	static ArrayList<Point> points = new ArrayList<Point>();
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int m= sc.nextInt();
//		int n = sc.nextInt();
//		
//		box = new int[n+1][m+1];
//		res = new int[n+1][m+1];
//		
//		for(int y = 1 ; y <= n ; y ++){
//			for(int x = 1; x <= n ; x++){
//				box[y][x] = sc.nextInt();
//				if(box[y][x] == 1){
//					points.add(new Point(x,y));
//					ripenCount += 1;
//				}
//			}
//		}
//		
//		//여기부터 이제,
//		//익은 것 찾아서, 주변을 오염시키자
//		for(int i = 0 ; i < )
//		points.get(arg0)
//		
//		
//	}
//}
//



public class RipenTomato {
	
	static Queue<Point> points = new LinkedList<Point>();
	static int[][] map ;
	static int[][] res ;
	
	static int x = 0;
	static int y = 0 ;
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws FileNotFoundException{
		//Scanner sc = new Scanner(new FileInputStream("C:\\Users\\Jang\\Desktop\\input.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		x= sc.nextInt();
		y = sc.nextInt();
		map = new int[y+1][x+1];
		res = new int[y+1][x+1];
		
		for(int i = 1 ; i <= y ; i++){
			for(int j = 1 ; j <= x ; j++){
				map[y][x] = sc.nextInt();
			}
		}
		for(int i = 1 ; i <= y ; i++){
			for(int j = 1 ; j <= x ; j++){
				if(map[i][j] == 1 && res[i][j] == 0){
					dfs(j,i,1);
				}
			}
		}
		
		
		
		int resVal = findMaxim();
		System.out.println(resVal);
	}
	
	public static void dfs(int fx , int fy , int depth){
		
		res[fy][fx] = depth;
		
		for(int i = 0; i < 4 ; i++){
				int nx = fx + dx[i]; 
				int ny = fy + dy[i];
				
				if(nx >= 1 && nx <= x && ny >= 1 && nx <= y){
					if(map[ny][nx] == 1 && res[ny][nx] == 0){
						dfs(nx, ny, depth +1 );
					}
				}
		}
		
		
	}
	
	public static int findMaxim(){
		int max = 0;
		for(int i = 1 ; i <= y ; i++){
			for(int j = 1 ; j <= x ; j++){
				if(res[i][j] >= max){
					max =res[i][j]; 
				}
			}
		}
		
		return max;
	}
	
}

