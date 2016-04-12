package kr.ac.kw;

import java.util.Scanner;

public class _11724 {
	static int node;
	static int edge;
	static int arr[][] ;
	
	static int idx[] ;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		node = sc.nextInt();
		edge = sc.nextInt();
		arr = new int[node+1][node+1];
		idx = new int[node+1];
		
		for(int i = 1 ; i <= edge ; i++){
			int a= sc.nextInt();
			int b = sc.nextInt();
			
			arr[a][b] = arr[b][a] = 1;
		}
		int k = 1;
		for(int i = 1; i <= node ; i++){
			dfs(i, k++);
		}
		
		
		for(int i = 1 ; i<= node ; i++){
			System.out.println(idx[i]);
		}
	}
	
	public static void dfs(int start , int k ){
		for(int i = 1 ; i<= node ; i++){
			if(arr[i][start] == 1){
				if(idx[i] == 0 &&  start != i ){
					idx[i] = k;
					dfs(i , k);
				}
			}
		}
	}
}
