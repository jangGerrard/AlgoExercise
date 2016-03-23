package kr.ac.kw;

import java.util.Scanner;

public class DrinkWine {
	static int[] in ;
	static int[] d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		in = new int[n+1];
		d = new int[n+1];
		
		for(int i = 1 ; i <= n ; i++){
			in[i] = sc.nextInt();
		}
		d[1] = in[1];
		d[2] = in[1]+in[2];
		
		
		for(int i = 3; i <= n ; i++){
			d[i] = in[i];
			if(d[i-1] + in[i] > d[i]){
				d[i] = d[i-1] + in[i];
			}
			if(d[i-2] + in[i] > d[i] ){
				d[i] = d[i-2] + in[i];
			}
		}
		
		System.out.println("d[i] : " + d[n]);
		
	}
	
}
