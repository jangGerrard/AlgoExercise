package com.problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

///정규식으로 문자열을 제거하는 방법을 쓰려고 했는데
///예1번의 경우를 잘 해결하지 못하는 문제가 있습니다.

public class _E {
	
	static final String jennifer = "JENNIFERSOFT";
	static int count = 0;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		
		String replaced = new String(in);
		for(int i = 0 ; i < jennifer.length(); i++){
			String c = jennifer.charAt(i)+"";
			
			Pattern p = Pattern.compile("[a-z]+");
			Matcher m = p.matcher(replaced);
			//
			while(m.find()){
				replaced = new String(replaced.replaceFirst(c , ""));
				System.out.println(replaced);
				count ++;
			}
		}
		
		System.out.println( jennifer.length() - count);
	}
}
