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
		for(int i = 2 ; i <= n ; i++){
			d[i] = p[i];
			for(int j = 1 ;  j <= i ; j++){
				if(d[i-j] + d[j] > d[i]){
					d[i] = d[i-j]+ d[j];
				}
			}
		}
		for(int i = 1; i <= n ; i++	){
			
			System.out.println(d[i]);
		}
	}
}
