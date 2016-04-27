package kr.ac.kw;

import java.util.Scanner;

public class _10164 {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int in[][] = new int [n+1][m+1];
		int d[][] =  new int [n+1][m+1];
		Point p = new Point(1,1);
		int count= 1;
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= m ; j++){
				in[i][j] = count;
				if(count == k)
					p = new Point(j,i);
				count++;
			}
		}
		
		d[1][1] = 1;
		for(int i = 1 ; i <= p.y ; i++){
			for(int j = 1; j <= p.x ; j++){
				if((j-1) > 0 ){
					d[i][j] += d[i][j-1];
				}
				if((i-1) > 0){
					d[i][j] += d[i-1][j];
				}
			}
		}
		
		int temp = d[p.y][p.x];
		d = new int[n+1][m+1];
		d[p.y][p.x] = 1;
		for(int i = p.y ; i <= n ; i++){
			for(int j = p.x ; j <= m ; j++){
				if((j-1) > 0 ){
					d[i][j] += d[i][j-1];
				}
				if((i-1) > 0){
					d[i][j] += d[i-1][j];
				}
			}
		}
		
		
		int res = temp * d[n][m];
		System.out.println(res);
	}
}
