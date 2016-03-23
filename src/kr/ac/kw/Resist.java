package kr.ac.kw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Resist {

	static Map<String, Integer> valueMaps = new HashMap<String,Integer>();
	static Map<String, Long> multiMaps = new HashMap<String,Long>();
	public static void init(){
		valueMaps.put("black", 0);
		multiMaps.put("black", (long) 1);
		
		valueMaps.put("brown", 1);
		multiMaps.put("brown", (long) 10);
		
		valueMaps.put("red", 2);
		multiMaps.put("red", (long) 100);
		
		valueMaps.put("orange", 3);
		multiMaps.put("orange", (long) 1000);
		
		valueMaps.put("yellow", 4);
		multiMaps.put("yellow", (long) 10000);
		
		valueMaps.put("green", 5);
		multiMaps.put("green", (long) 100000);
		
		valueMaps.put("blue", 6);
		multiMaps.put("blue", (long) 1000000);
		
		valueMaps.put("violet", 7);
		multiMaps.put("violet", (long) 10000000);
		
		valueMaps.put("grey", 8);
		multiMaps.put("grey", (long) 100000000);
		
		valueMaps.put("white", 9);
		multiMaps.put("white", (long) 1000000000);
		
	}
	
	
	
	public static void main(String[] args) {
		init();
		Scanner sc = new Scanner(System.in);	
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		String in = valueMaps.get(a) + (valueMaps.get(b) + "");
		long res = Long.parseLong(in) *multiMaps.get(c) ;
		
		System.out.println("res : "+res );
	}
}
