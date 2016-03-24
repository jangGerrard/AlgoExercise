package kr.ac.kw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _1699 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n+1];
		int last = 1;
		d[1] = 1;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int temp = 0 ; 
		int k = 1;
		while(temp < 100000){
			temp  = (int) Math.pow(k, 2);
			map.put(temp, temp);
			k++;
		}
		
		
		//System.out.println(Math.sqrt(4.0));
		for(int i =2 ; i <= n ; i++	){
			//제곱일 경우에 그거 빼고 나머지
			if(map.get(i) != null){
				d[i] = 1;
				last = i;
			} else {
				d[i] = d[i-last] + d[last];
			}
		}
		
		System.out.println(d[n]);
		
	}
}
