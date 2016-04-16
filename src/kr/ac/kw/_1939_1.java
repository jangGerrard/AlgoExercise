package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1939_1 {
	
	static long [][] in;
	static long[][] min;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m = sc.nextInt();
		
		in = new long[n+1][n+1];
		min = new long[n+1][n+1];
		
		for(int i = 1 ; i<= m ; i++){
			int from = sc.nextInt();
			int to = sc.nextInt();
			long weight = sc.nextLong();
			if(in[from][to] == 0 ){
				in[from][to] =in[to][from]= weight;
			} else {
				if(weight > in[from][to] ){
					in[from][to] =in[to][from]= weight;	
				}
			}
		}
		int from = sc.nextInt();
		int to = sc.nextInt();

		Queue<_DD> q = new LinkedList<_DD>();
		q.add(new _DD(from, 9999999));
		
		while(q.size() != 0){
			_DD a = q.remove();
			for(int i = 1; i <= n ; i++){
				if(a.from != i && in[a.from][i] != 0 ){
					if(in[a.from][i] < a.weight){
						q.add(new _DD(i, a.weight + in[a.from][i]));
					}
				}
			}
		}
		
		
		
		
		
		System.out.println("(from");
	}
}

class _DD{
	public int from;
	public long weight;
	public _DD(int from ){
		this.from = from;
	}
	
	public _DD(int from, long weight){
		this.from = from;
		this.weight =  weight;
	}
}
 