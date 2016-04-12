package kr.ac.kw;

import java.util.Scanner;

//public class _2579 {
//	static int [] d; 
//	static int [] in ;
//	
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n  = sc.nextInt();
//		
//		d = new int[n+1];
//		in = new int[n+1];
//		
//		for(int i = 1; i <= n ; i++){
//			in[i] = sc.nextInt();
//		}
//		
//		d[1] = in[1];
//		d[2] = in[1] + in[2] ; 
//		
//		for(int i = 3 ; i <= n ; i++ ){
//			if(n == i){
//				if(d[i] < d[i-2] + in[i]){
//					d[i] = d[i-2] + in[i];
//				}
//				if(d[i] < d[i-3] + in[i] + in[i-1]){
//					d[i] = d[i-3] + in[i] + in[i-1];
//				}
//			} else {
//				d[i] = d[i-1];
//				if(d[i] < d[i-2] + in[i]){
//					d[i] = d[i-2] + in[i];
//				}
//				if(d[i] < d[i-3] + in[i] + in[i-1]){
//					d[i] = d[i-3] + in[i] + in[i-1];
//				}
//			}
//		}
//		
//		System.out.println(d[n]);
//		2
//		
//	}
//}

public class _2579{
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int in[] = new int[n+1];
		int d[][] = new int[n+1][3];
		for(int i = 1; i <= n ; i ++){
			in[i] = sc.nextInt();
		}
		
		d[1][0] = 0;
		d[1][1] = in[1];
		d[1][2] = in[1];
		
		for(int i = 2 ; i<= n ; i++	){
			d[i][0] = d[i-1][0];
			if(d[i-1][1] > d[i-1][0]){
				d[i][0] = d[i-1][1];
			} 
			if(d[i-1][2] > d[i-1][1]){
				d[i][0] = d[i-1][2];
			}
			
			d[i][1] = d[i-1][0] + in[i];
			d[i][2] = d[i-1][1] + in[i];
			
			
		}
		
		System.out.println(Math.max(d[n][1], d[n][2]));
		
		
	}
}
