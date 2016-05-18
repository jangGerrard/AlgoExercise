package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _11403_2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] in = new int[n+1][n+1];
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1;  j <= n ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		//입력 끝
		int res[][] = new int[n+1][n+1];
		int [] visited ;
		
		for(int i = 1; i <= n ; i++){
			visited = new int[n+1];
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(i);
			visited[i] = 1;
			while(q.size() != 0 ){
				int item = q.remove();
				for(int k = 1; k <= n ;k ++){
					if(visited[k] == 0 && in[item][k] == 1 ){
						visited[k] = 1;
						q.add(k);
					}
				}
			}
			
			for(int j = 1; j <= n ; j ++){
				res[i][j] = visited[j] ;
			}
		}
		
		for(int i = 1 ; i <= n ; i ++){
			for(int j = 1; j <= n; j++){
				System.out.print(res[i][j] +" ");
			}
			System.out.println();
		}
		
	}
}
