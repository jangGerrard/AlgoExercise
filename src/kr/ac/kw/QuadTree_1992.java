package kr.ac.kw;

import java.util.Scanner;

public class QuadTree_1992 {
	public static int[][] map = {{0,0,0,0,0,0,0,0,0},{0,1,1,1,1,0,0,0,0},{0,1,1,1,1,0,0,0,0},{0,0,0,0,1,1,1,0,0},
									{0,0,0,0,1,1,1,0,0},{0,1,1,1,1,0,0,0,0},{0,1,1,1,1,0,0,0,0},{0,1,1,1,1,0,0,1,1},{0, 1,1,1,1,0,0,1,1}};
	public static String result = "";
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		map = new int[n+1][n+1];
//		for(int y = 1 ; y <= n ; y++){
//			for(int x = 1 ; x <= n ; x++){
//				map[y][x] = sc.nextInt();
//			}
//		}
		
		result = depth(1, 1, n);
		
		System.out.println("result : "+result);
	}
	
	public static String depth(int startX, int startY, int size){
		boolean res = checkLinearly(startX, startY, size);
		
		if(res){
			return ""+map[startY][startX];
		} else {
			int halfSize = size/2;
			String temp ="";
			temp += ("(" + depth(startX , startY , halfSize) + ")");
			temp += ("(" + depth(startX + halfSize , startY , halfSize)+")");
			temp += ("(" + depth(startX , startY +halfSize  , halfSize)+")");
			temp += ("(" + depth(startX + halfSize, startY + halfSize, halfSize)+")");		
			return temp;
		}
	}
	
	public static boolean checkLinearly(int startX, int startY , int size){
		
		
		int basis = map[startY][startX];
		for(int y = 1 ; y <= size ; y++){
			for(int x = 1 ; x <= size ; x++){
				if(basis != map[startY+(y-1)][startX+(x-1)]){
					return false;
				}
			}
		}
		
		return true;
	}
}
