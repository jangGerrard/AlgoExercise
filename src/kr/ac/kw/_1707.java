package kr.ac.kw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1707 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for(int t = 1 ; t <= test_case ; t++){
			int v = sc.nextInt();
			int e = sc.nextInt();
			
			int[] color = new int[v+1];
			int[][] in = new int[v+1][v+1];
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			in[from][to] = in[to][from] = 1;
			
			for(int i = 1 ; i <= v ; i++){
				for(int j = 1; j <= v ; j++){
					
				}
			}
			
		}
	}
}
