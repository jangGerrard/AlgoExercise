package kr.ac.kw;

import java.util.Scanner;

public class _1937 {
	
	static int[][] in;
	static int[][] d;
	
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		in = new int[n+1][n+1];
		d = new int[n+1][n+1];
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				for(int k = 0 ; k < 4 ; k++){
					int nx = j + dx[k];
					int ny = i + dy[k];
					
					if(nx >0 && nx <= n && ny > 0 && ny <= n){
						if(in[i][j] > in[ny][nx]){
							if(d[i][j] < d[ny][nx] + 1)
								d[i][j] = d[ny][nx] + 1;
						}
					}
				}
			}
		}
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
