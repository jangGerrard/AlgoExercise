package kr.ac.kw;

import java.util.Scanner;

public class ExplorePath {
	
	public static int [][] arr;
	
	public static int [][] resultArr;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr= new int[n+1][n+1];
		resultArr = new int[n+1][n+1];
		
		for(int y = 1 ; y <= n ; y++){
			for(int x = 1 ; x <= n ; x++){
				arr[y][x] = sc.nextInt();
			}
		}
		
		for(int y = 1 ; y <= n ; y++){
			for(int x = 1 ; x <= n ; x++){
				if(y == x){
					resultArr[y][x] = 1;
				} else {
					if(findPath(x, y )){
						resultArr[y][x] = 1;
					}else {
						resultArr[y][x] = 0;
					}
				}
			}
		}
	}
	
	public static boolean findPath(int x, int y ){
		
		if(arr[y][x] == 1){
			return true;
		}
		
		
		return false;
	}
}
