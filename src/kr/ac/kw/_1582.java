package kr.ac.kw;

import java.util.Scanner;

public class _1582 {
	static int n ;
	static int m;
	static int k;
	static char[][] in;
	static int [][] d ;
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k =  sc.nextInt();
		in= new char[n+1][m+1];
		d = new int[n+1][m+1];
		for(int i = 1 ; i <= n ; i++){
			String temp = sc.next();
			for(int j = 0; j < m ; j++){
				in[i][j+1] = temp.charAt(j);
			}
		}
		for(int i = 1; i <= n ; i++){
			d[i][1] = 1;
		}
		for(int i = 1 ; i <= n ; i++	 ){
			for(int j = 2; j <= m ; j++){
				if(in[i][j-1] ==  in[i][j]){
					d[i][j] = d[i][j-1] + 1;
				} else {
					d[i][j] = 1;
				}
			}
		}
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= m ; j++){
				
			}
		}
		
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= m ; j++){
				System.out.print( "\t"+ d[i][j] );
			}
			System.out.println();
		}
	}
}
