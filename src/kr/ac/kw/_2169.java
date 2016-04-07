package kr.ac.kw;

import java.util.Scanner;

public class _2169 {
	static int n ;
	static int m ;
	static final int INT_MIN = -9999999;
	
	static int[] dx = {0, -1, 1};
	static int[] dy = {-1, 0, 0};
	
	static int[][] in = new int[n+1][m+1];
	static int[][] d = new int[n+1][m+1];
	static boolean[][] visited ;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		m = sc.nextInt();
		in = new int[n+1][m+1];
		d = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1; i <= n ; i++	){
			for(int j = 1; j <= m ; j++){
				if(i == 1 && j == 1){
					d[i][j] = in[i][j];
					visited[i][j] = true;
				}else
					calc(i , j );
			}
		}
		
		System.out.println(d[n][m]);
	}
	
	public static int calc(int i , int j ){
		int l = j -1;
		int r = j+1;
		int u = i -1;
		
		
		
		int lval = INT_MIN;
		int rval = INT_MIN;
		int uval = INT_MIN;
		int resval = INT_MIN;
		int flag=0;
		
		if(l >= 1 && l <= m  ){
			if(d[i][l] != 0 || !visited[i][l]){ 
				lval = d[i][l] + in[i][j];
			} else {
				lval = calc(i,l)+ in[i][j];
			}
		}
		if(r >= 1 && r <= m ){
			if(d[i][r] != 0 || !visited[i][l]){ 
				rval = d[i][r]+ in[i][j];
			} else {
				rval = calc(i,r)+ in[i][j];
			}
		}
		if(u >= 1 && u <= n ){
			if(d[u][j] != 0 || !visited[u][j]){ 
				uval = d[u][j]+ in[i][j];
			} else {
				uval = calc(u,j)+ in[i][j];
			}
		}
		
		if(lval != INT_MIN){
			if(lval >= resval){
				resval = lval;
				flag = 1;
				d[i][j] = lval;
			}
		}

		if(rval != INT_MIN){
			if(rval >= resval){
				flag = 2;
				resval = rval;
				d[i][j] = rval;
			}
		}
		

		if(uval != INT_MIN){
			if(uval >= resval){
				resval = uval;
				flag = 3;
				d[i][j] = uval;
			}
		}
		
		
		if(flag == 3) 
			visited[u][j] = true;
		else if(flag == 2)
			visited[i][r] = true;
		else if(flag == 1)
			visited[i][l] = true;
		return resval;
	}
}
