package kr.ac.kw;

import java.util.Scanner;

public class _1009 {

	static int res[][];
	static int range[];
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int test_case = sc.nextInt();
		
		init();
		
		
		for(int t = 1 ; t <= test_case ; t++){
			int a = sc.nextInt();
			
			
			a %= 10;
			if(a == 0){
				a = 10;
			}
			
			int b = sc.nextInt();
			if(range[a] == 1){
				System.out.println(res[a][1]);
			} else {
				int c = b%range[a] == 0 ? 4 :  b%range[a];
				System.out.println(res[a][c]);
			}
			
		}
	}
	
	private static void init(){
		res = new int[10+1][10+1];
		range = new int[10+1];
		for(int i = 1; i <= 10 ; i++){
			for(int j = 1; j <= 10 ; j++){
				res[i][j] = -1;
			}
		}
		
		for(int i = 1 ; i <= 10 ; i++){
			int temp = i % 10;
			res[i][1] = temp;
			range[i] = 1;
			for(int j = 2; ; j++){
				temp *= i;
				if(temp % 10 == res[i][1]){
					range[i] = j-1 ;
					break;
				} else {
					res[i][j] = temp % 10;
				}
			}
		}
		
		res[10][1] = 10;
	}
}
