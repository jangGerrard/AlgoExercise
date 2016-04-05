package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//중량 제한
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
					bridges[to][from][j] = bridges[from][to][j] = sc.nextInt();
					break;
				}
			}
		}
		
		from = sc.nextInt();
		to = sc.nextInt();
		//입력은 끝
		
		
		Queue<Packing> q = new LinkedList<Packing>();
		q.add(new Packing(from));
		while(q.size() != 0 ){
			//s
			Packing p = q.remove();
			int from = p.num;
			
			for(int i = 1 ; i <= n ; i++	 ){
				if(i != from ){
					for(int j = 1 ; j <= m ; j++ ){
						if(bridges[from][i][j] != 0){
							//q.add(new Packing());
						} else {
							break;
						}
					}
				}
			}
		}
		
		
	}
}

class Packing{
	
	public int num;
	public int min;
	
	public Packing(int num){
		this.num = num;
	}
	
	public Packing(int num, int min){
		this.num = num;
		this.min = min;
	}
}
