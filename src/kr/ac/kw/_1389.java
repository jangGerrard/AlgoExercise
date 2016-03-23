package kr.ac.kw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1389 {
	
	static int[][] relation;
	static int[][] res;
	static boolean[] path;
	static int n ; 
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int r = sc.nextInt();
		relation = new int[n+1][n+1];
		res = new int[n+1][n+1];
		
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				res[i][j] = 99999;
			}
		}
		
		for(int i = 1; i <= r; i++){
			int a = sc.nextInt();
			int b= sc.nextInt();
			relation[a][b] = 1;
			relation[b][a] = 1;
		}
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				if(i != j){
					path= new boolean[n +1 ];
					
					//System.out.println(findKebin(i , j, 1, path));
					res[i][j] = res[j][i] = findKebin(i, j , 1 , path);
				}
			}
		}
		int num = 1;
		int sum = 999999;
		for(int i = 1; i <= n ; i++){
			int temp = 0 ;
			for(int j = 1; j <= n ; j++){
				if(i != j){
					temp += res[i][j];
				}
			}
			if(sum > temp){
				sum = temp;
				num = i;
			}
		}
		
		System.out.println(num);
	}
	
	public static int findKebin(int from , int to, int length, boolean[] path ){
		int result = 99999 ; 
		//;
		if(relation[from][to] == 1){
			return length;
		}
		
		for(int i = 1; i <= n ; i++){
			if(from != i && to != i && !path[i]){
				path[i] = true;
				
				int temp = findKebin(i , to, length +1, path);
				if(temp < result ){
					result = temp;
				}
			}
		}
		
		return result ;
	}
}
