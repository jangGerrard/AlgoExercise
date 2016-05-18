package kr.ac.kw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class _1707_2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for(int t = 1 ; t <= test_case ;  t++){
			
			int  v = sc.nextInt();
			int e = sc.nextInt();
			int[] color= new int[v+1];
			List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
			for(int i  = 0 ; i <= v ; i++ ){
				ArrayList<Integer> temp = new ArrayList<Integer>();
				a.add(temp);
			}
			for(int i = 1 ; i <= e ; i++){
				int start = sc.nextInt();
				int end = sc.nextInt();
				a.get(start).add(end);
			}
			///입력 끝
			
			
			///bfs로 풀어보자.
			for(int i = 1 ; i <= v ; i ++){
				Queue<Integer> q = new  LinkedList<Integer>();
				q.add(i);
				color[i] = 1;
				if(a.get(i).size() != 0){
					for(int j = 0 ; j < a.get(i).size(); j ++){
						
					}
				}
			}
			
			
			
		}
	}

}
