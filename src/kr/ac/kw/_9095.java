package kr.ac.kw;

import java.util.Scanner;

public class _9095 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int d[] ; 
		for(int t =  1;   t <= test_case ; t++){
			int n = sc.nextInt();
			d = new int [n+1];
			d[1] = 1;
			d[2] = 2;
			d[3] = 4;
			for(int i = 4 ; i <= n ; i++){
				d[i] = d[i-1] + d[i-2] + d[i-3];
				
			}
			
			System.out.println(d[n]);
		}
	}
}
