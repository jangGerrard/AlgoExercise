package kr.ac.kw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _2092 {
	static int t;
	static int a; 
	static int s ;
	static int b;
	static List<Integer> lists;
	static int[] d  ;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		lists = new ArrayList<Integer>();
		
		t = sc.nextInt();
		a = sc.nextInt();
		s = sc.nextInt();
		b = sc.nextInt();
		d = new int[b+1];
		
		for(int i = 1 ; i <= a ; i++){
			lists.add(sc.nextInt());
		}
		
		lists.sort(new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				if(arg0 > arg1){
					return 1 ;
				} else if( arg0 < arg1 ){
					return -1 ;
				} else {
					return 0;
				}
			}
		});
		
		for(int i = 0 ; i < lists.size(); i++){
			System.out.println(lists.get(i));
		}
		
		
		for(int i = 1 ; i <= b ; i++	){
//			d[i] = 
		}
		
		
		
	}
}

class Lists{
	public Set<Integer> list;
	
}
