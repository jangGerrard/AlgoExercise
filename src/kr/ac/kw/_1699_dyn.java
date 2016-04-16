package kr.ac.kw;

import java.util.Scanner;

public class _1699_dyn {
	static int n ;
	static int d[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d= new int[n+1];
		
		for(int i = 1; i <= n ; i++){
			d[i] = i;
			for(int j = 1 ; j * j <= i ; j++){
				if(d[i] > d[i - j*j ] +1 ){
					d[i] = d[ i - j * j ] +1 ;
				}
			}
		}
		
		System.out.println(d[n]);
	}
}
