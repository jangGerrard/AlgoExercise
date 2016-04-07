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
				if(bridges[from][to][j] == 0){
					bridges[to][from][j] = bridges[from][to][j] = sc.nextInt();
					break;
				}
			}
		}
		
		from = sc.nextInt();
		to = sc.nextInt();
		//입력은 끝
		
		Queue<Packing> q = new LinkedList<Packing>();
		int min = 9999999;
		q.add(new Packing(from , to ));
		
		while(q.size() != 0){
			Packing p  = q.remove();
			if(bridges[p.from][p.to][0] != 0 ){
				int temp = findMin(p.from, p.to);
				if(min > temp ){
					min = temp;
				}
			}else {
				for(int i =  1; i <= n ; i++	){
					
					if( bridges[i][p.to][0] != 0 && i != p.from ){
						q.add(new Packing(i , p.to));
					} else {
						
					}
					
				}
			}
		}
		
		System.out.println(min);
	}
	
	public static int findMin(int from , int to){
		int min = 999999;
		for(int i = 0 ; i <= m ; i++ ){
			if(bridges[from][to][i] != 0){
				if(min > bridges[from][to][i]){
					min = bridges[from][to][i];
				}
			} else {
				break;
			}
		}
		return min;
	}
}

class Packing{
	
	public int from;
	public int to;
	public int min;
	
	public Packing(int from , int to){
		this.from = from;
		this.to = to;
	}
	
	public Packing(int from , int to , int min){
		this.from = from ; 
		this.to = to;
		this.min = min;
	}
	
}
