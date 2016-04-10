package kr.ac.kw;

import java.util.Scanner;

public class _1796 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int n = input.length() + 1;
		char [] arr = new char[n+1];
		for(int i = 0 ; i < input.length() ; i++){
			arr[i+1] = input.charAt(i);
		}
		int cursor = 1;
		boolean forward = true;
		for(char i = 'a' ; i <= 'z' ; i++	 ){
			for(int j = 1; j <= n ; j++){
				if(forward){
//					checkIsExist(j);
				} else {
//					checkIsExist(n - j);
				}
				
			}
		}
	}
}
