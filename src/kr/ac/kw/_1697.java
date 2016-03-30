package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1697 {
	
	static int[] res;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		res = new int[100000+1];
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(a);
		res[a] = 0;
		
		while(q.size() != 0 ){
			int cur = q.remove();
			
			for(int i = 0 ; i <= 3 ; i++){
				int idx;
				if(i == 0 ){
					idx = cur * 2;
					if(res[idx] ==  0){
						res[idx] = res[cur]+1;
					}
					q.add(idx);
				} else if ( i ==1 ){
					idx = cur -1;
					if(res[idx] ==  0){
						res[idx] = res[cur]+1;
					}
					q.add(idx);
				} else if(i == 2){
					idx = cur +1;
					if(res[idx] ==  0){
						res[idx] = res[cur]+1;
					}
					q.add(idx);
				}
			}
			
			if(res[b] != 0){
				break;
			}
		}
		
		System.out.println(res[b]);
	}
}
