package kr.ac.kw;

import java.util.Scanner;

public class _1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt(); 
		for(int i = 1 ; i < n ; ){
			i = i * (i+1) / 2;
		}
	}
}
