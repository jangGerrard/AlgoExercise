package com.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _A {
	
	public static void main(String[] args){
		List<Packing> lists = new ArrayList<Packing>();
		
		init(lists);
		
		Scanner sc = new Scanner(System.in);
		String temp =  sc.next(); 
		
		for(int i = 1 ; i <= temp.length(); i++){
			int idx  = temp.charAt(i-1) - 'A';
			lists.get(idx).countUp();
		}
		
		Collections.sort(lists,new Comparator<Packing>(){
			@Override
			public int compare(Packing left, Packing right) {
				
				if(left.count > right.count){
					return 1;
				} else if(left.count == right.count){
					if(left.c < right.c){
						return -1;
					} else{
						return 1;
					}
				} else {
					return -1;
				}
			}
		});
		
		for(int i = 0 ; i < lists.size(); i++){
			Packing tempPack = lists.get(i); 
			int curCount = tempPack.count	 ;
			char curChar = tempPack.c;
			if(curCount == 0 )
				continue;
			for(int j = 0 ; j < curCount; j++){
				System.out.print((char)curChar);
			}
		}
	}
	
	public static void init(List<Packing> counts){
		for(char i = 'A' ; i <= 'Z' ; i++)
		{
			counts.add(new Packing(i, 0));
		}
	}
}

class Packing{
	char c ; 
	int count ;
	public Packing(char c , int count){
		this.c = c;
		this.count = count;
	}
	public void countUp(){
		this.count ++;
	}
}
