package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1707_3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		for(int t= 1 ; t <= testCase ; t++){
			
			int v = sc.nextInt();
			boolean in[][] = new boolean[v+1][v+1];
			int e = sc.nextInt();
			for(int i = 1 ;i <= e ; i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				in[from][to] = in[to][from] = true;
			}
			
			boolean visited[] = new boolean[v+1];
			int color[] = new int[v + 1];
			boolean check = true;
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i =1 ; i <= v ; i ++){
				if(!visited[i]  ){
					q.add(i);
					visited[i] = true;
					
					while(q.size() != 0){
						if(!check)
							break;
						int item = q.remove();
						for(int k = 1; k <= v ; k++){
							if (in[item][k] ) {
								if (color[k] == 0) {
									color[k] = color[item] == 1 ? 2 : 1;
									q.add(k);
								} else {
									int rev = (color[item] == 1 ? 2 : 1);
									check = (color[k] == rev ? true : false);
								}
							}
						}
					}
					if(!check)
						break;
				}
			}
			
			String result = check ? "YES" : "NO";
			System.out.println(result);
		}
	}
}
