package kr.ac.kw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2616 {
	static int n  ;
	static int capa[];
	static int cartMax;
	static int d[];
	static int store[];
	static List <BB> a ; 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		capa = new int[n+1];
		d = new int[n+1];
		a = new ArrayList<BB>();
		
		a.add(new BB(-1,-1));
		a.add(new BB(-1,-1));
		a.add(new BB(-1,-1));
		
		for(int i = 1 ; i<= n ; i++){
			capa[i] = sc.nextInt();
		}
		cartMax = sc.nextInt();
		for(int i = 1; i <= cartMax -1; i++ ){
			d[i] = capa[i];
		}
		
		
		for(int i = cartMax ; i <= n ; i++){
			for(int j =0;  j < cartMax ; j++){
				d[i] += capa[i-j];
			}
			store(d[i],  i );
		}
		
		for(int i = 0 ; i < a.size(); i++){
			BB b  = a.get(i);
			System.out.println("value : "+b.value+", iter : "+b.i );
		}
			
				
	}
	
	public static void store(int value, int idx){
		for(int i = 0 ; i < 3 ; i++){
			BB b = a.get(i);
			if(value > b.value){
				a.remove(i);
				a.add(new BB(value, idx));
			}
		}
	}
}
class BB{
	public int i ; 
	public int value;
	public BB(int value, int i){
		this.i = i;
		this.value = value;
	}
}