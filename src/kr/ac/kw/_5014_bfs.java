package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _5014_bfs {
	static int f;
	static int s;
	static int g;
	static int u;
	static int d;
	
	static int res[];
	
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		f = sc.nextInt();
		s = sc.nextInt();
		g = sc.nextInt();
		u = sc.nextInt();
		d = sc.nextInt();
		res = new int[f+1];
		for(int i = 1; i <= f ; i++){
			res[i] = -1;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		res[s] = 0;
		while(q.size() != 0){
			int elem = q.remove();
			int down = elem - d;
			int up = elem + u;
			
			if(down >= 1 && down <= f && res[down] == -1){
				res[down] = res[elem] + 1;
				q.add(down);
			}
			if(up <= f && up >= 1&& res[up] == -1){
				res[up] = res[elem] + 1;
				q.add(up);
			}
		}
		
		System.out.println(res[g]);
		
	}
}
