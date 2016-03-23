package kr.ac.kw;

import java.util.Scanner;

public class BungBread {
	static int[] p  ;
	static int[] d ;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		p = new int[n+1];
		d = new int[n+1];
		
		for(int i = 1 ; i <= n ; i++){
			p[i] = sc.nextInt();
		}
		d[1] = p[1];
		for	(int i = 1 ; i <= n ; i++){	
			d[i] = Math.max(d[i-1] + d[1] , p[i] );
		}
		
		System.out.println(d[n]);
	}
}
