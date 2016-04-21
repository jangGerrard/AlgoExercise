package kr.ac.kw;
/*
 * 떨어진거 어쩔수 없자나
 * 그냥 열심히 또 하는수밖에
 * 내가 뭐 할수 없으니 그냥
 * 또하는거지 뭐..
 * */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1697_1 {
	
	static int [] dx = {-1, 1};
	static int n ;
	static int k;
	static int d[];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		d = new int[100000+1];
		for(int i = 0  ; i < 100001; i ++	){
			d[i] = -9999;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		d[n] = 0 ;
		while(q.size() != 0){
			int elem = q.remove();
			
			for(int k = 0 ; k < 3; k++){
				int nx;
				if( k == 2 ){
					nx = elem * k;
				} else {
					nx = elem + dx[k];
				}
				
				if(nx >=0 && nx <= 100000){
					if(d[nx] == -9999 ){
						d[nx] = d[elem]+1;
						q.add(nx);
					} else if(d[nx] > d[elem]+1){
						d[nx] = d[elem]+1;
						q.add(nx);
					}
				}
			}
		}
		
		
		System.out.println(d[k]);
		
	}
}
