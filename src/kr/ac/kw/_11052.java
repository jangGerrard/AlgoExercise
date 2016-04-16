package kr.ac.kw;

import java.util.Scanner;

public class _11052 {
	
	static int d[];
	static int in[];
	static int n ;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		d = new int[n+1];
		in = new int[n+1];
		
		for(int i = 1; i <= n ; i++){
			in[i] = sc.nextInt();
		}
		
		d[1] = in[1];
		for(int i = 1 ; i<=n ; i++){
			d[i] = in[i];
			for(int j = 1; j <= i-1; j++){
				if( d[i] < d[j] + d[i - j ]){
					d[i] = d[j] + d[i - j ];
				}
			}
		}
		
		
		System.out.println(d[n]);
		
	}
}
