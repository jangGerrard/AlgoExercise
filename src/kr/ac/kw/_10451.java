package kr.ac.kw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _10451 {
	static int[] arr;
	static int conn [][] ; 
	static int [] color;
	static int n;
	static Set<Integer> sets;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sets = new HashSet<Integer>();
		int test_case = sc.nextInt();
		for(int t = 1 ; t <= test_case ; t++){
			n = sc.nextInt();
			arr = new int[n+1];
			color= new int[n+1];
			conn = new int[n+1][n+1];
			for(int i = 1; i <= n; i++){
				arr[i] = sc.nextInt();
				conn[i][arr[i]] = conn[arr[i]][i] = 1;
			}
			
			int k = 1;
			for(int i = 1; i <= n ; i++){
				dfs(i,k);
				k += 1;
			}
			
			
			for(int i = 1; i <= n ; i++){
				System.out.println("color : " + color[i]);
			}
			
		}
	}
	
	public static void dfs(int start , int k ){
		for(int i = 1; i <= n ; i++){
			if(conn[start][i] == 1 ){
//				if(sets.contains(start)){
//					return;
//				}
				if(color[start] == 0 && start != i){
					color[start] = k;
					sets.add(start);
					dfs(i,k);
				}
				
			}
		}
	}
}
