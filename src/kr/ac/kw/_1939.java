package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1939 {
	static int n ;
	static int m;
	static int from;
	static int to;
	static int bridges[][][];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		bridges = new int [n+1][n+1][m+1];

		for(int i = 1; i<= m ; i++){
			int from = sc.nextInt();
			int to = sc.nextInt();
			for(int j = 0 ;  ; j++){
				if(bridges[from][to][j] != 0){
					bridges[from][to][j] = sc.nextInt();
					break;
				}
			}
		}
		
		from = sc.nextInt();
		to = sc.nextInt();
		//입력은 끝
		
		
		Queue<Packing> q = new LinkedList<Packing>();
		while(q.size() != 0 ){
			//s
		}
		
		
	}
}

class Packing{
	
	public int num;
	public int min;
	
	public Packing(int num, int min){
		this.num = num;
		this.min = min;
	}
}
