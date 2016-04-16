package kr.ac.kw;

import java.util.Scanner;

public class _1149 {
	
	static final int R = 0;
	static final int G = 1;
	static final int B = 2;
	static int n ;
	static int [][] d;
	static int [][] in;
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		
		in = new int[n+1][3];
		d = new int[n+1][3];
		
		for(int i = 1 ; i<= n ; i++){
			in[i][R] =  sc.nextInt();
			in[i][G] =  sc.nextInt();
			in[i][B] =  sc.nextInt();
			
		}
		d[1][R] = in[1][R];
		d[1][G] = in[1][G];
		d[1][B] = in[1][B];
		
		for(int i = 2 ; i<=n ; i++){
			d[i][R] = Math.min(d[i-1][G] +in[i][R], d[i-1][B]+in[i][R]);
			d[i][G] = Math.min(d[i-1][R] + in[i][G], d[i-1][B] + in[i][G]);
			d[i][B] = Math.min(d[i-1][R] + in[i][B], d[i-1][G] + in[i][B]);
		}
		
		int res = d[n][R];
		if(res > d[n][G]){
			res = d[n][G];
		}
		if(res > d[n][B]){
			res = d[n][B];
		}
		
		System.out.println(res);
	}
}
