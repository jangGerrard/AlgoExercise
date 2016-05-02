package kr.ac.kw;

import java.util.Scanner;

public class _2294 {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int [] in = new int[n+1];
		int [] d = new int[k+1];
		for(int i = 1 ; i <= n ; i++){
			in[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n ; i ++){
			if(in[i] <= k)
				d[in[i]] = 1;
		}
		for(int i = 1; i <= k ; i++){
			if(d[i] != 1){
				d[i] = 9999;
			}
		}
		
		//붕어빵이 더하기랑 비슷하담.
		for(int i = 1; i <= k ; i++	){
			for(int j = 1 ; j  < i  ; j++){
				if(d[i] > d[i-j] + d[j] ){
					d[i] = d[i-j] + d[j]; 
				}
			}
		}
//		for(int i =1 ; i <= k ; i++){
//			System.out.print(d[i]+"\t");
//		}
//		System.out.println();
		
		if(d[k] == 9999){
			System.out.println(-1);
		} else {
			System.out.println(d[k]);
		}
	}
}