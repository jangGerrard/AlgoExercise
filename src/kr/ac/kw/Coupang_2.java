package kr.ac.kw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Coupang_2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, _Packing> maps = new HashMap<String, _Packing>();
		for(int i = 0 ; i < n ; i ++){
			String input = sc.next();
			String[] splited = input.split(",");
			maps.put(splited[0], new _Packing(false ,splited[0]+"", Integer.parseInt(splited[1]) ));
		}
		
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i ++){
			String input = sc.next();
			String[] splited = input.split(",");
			String main =  splited[0];
			String sub = splited[1];
			_Packing gotObject = maps.get(main);
			gotObject.addCount(maps.get(sub).getCount());
			maps.get(main).setMain();
		}
		
		
		List<_Packing> lists = new ArrayList<_Packing>(maps.values());
		
		for(int i = 0 ; i < lists.size() ; i++){
			_Packing p = lists.get(i);
			if(p.isMain()){
				System.out.println(p.toString());
			}
		}
	}
}

class _Packing{
	private boolean isMain;
	private String key ; 
	private int count;
	public _Packing(boolean isMain, String key, int count) {
		this.isMain = isMain;
		this.key = key;
		this.count = count;
	}
	
	public boolean isMain(){
		return this.isMain;
	}
	
	public void setMain(){
		this.isMain = true;
	}
	
	public void setNotMain(){
		this.isMain = false;
	}
	
	public void addCount(int count){
		this.count += count;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public String toString(){
		return this.key + ", "+this.count;
	}
	
}