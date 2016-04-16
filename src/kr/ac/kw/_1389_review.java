package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1389_review {
	static int n ;
	static int in[][];
	static int d[][];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int rel = sc.nextInt();
		in = new int[n+1][n+1];
		d = new int[n+1] [n+1];
		for(int i = 1; i <= rel ; i++){
			int a =sc.nextInt();
			int b = sc.nextInt();
			in[a][b]= in[b][a] = 1;
		}
		//input
		for(int i = 1 ; i<= n ; i++)	{
			for(int j = 1;  j  <= n ; j++){
				bfs(i,j);
			}
		}
		
//		for(int i = 1 ; i<= n ; i++)	{
//			for(int j = 1;  j  <= n ; j++){
//				System.out.printf("%d\t",d[i][j]);
//			}
//			System.out.println();
//		}
		int min = 9999999;
		int minPeople = 0;
		for(int i = 1 ; i <= n; i++){
			int sum= 0 ;
			for(int j = 1 ; j <= n ; j++){
				sum += d[i][j];
			}
			if(sum < min){
				min = sum;
				minPeople = i;
			}
			
		}
		
		System.out.println(minPeople);
	}
	
	public static void bfs(int start, int end){
		if(in[start][end] == 1 ){
			d[start][end] = d[end][start] =1 ;
			return;
		}
		Queue<P> q = new LinkedList<P>();
		for(int i =1 ; i <= n ; i++){
			if(in[start][i] == 1 && start != i ){
				q.add(new P(i , 2));
			}
		}
		
		while(q.size() != 0){
			P p = q.remove();
			for(int i =1 ; i <= n ; i++){
				if(in[p.num][end] == 1 && d[start][end] == 0 ){
					d[start][end] = p.depth;
					break;
				} else {
					if(in[i][end] == 1 && d[start][end] == 0){
						q.add(new P(i , p.depth +1));
					}
				}
			}
		}
		
	}
}

class P{
	public int num;
	public int depth ; 
	public P(int num, int depth){
		this.num = num;
		this.depth = depth;
	}
}

