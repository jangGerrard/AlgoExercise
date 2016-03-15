package kr.ac.kw;

import java.util.Scanner;

public class _11575 {
	public static void main(String[] args){
		///affine cliper
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t= 1; t <= testCase; t++){
			int a = sc.nextInt();
			int b= sc.nextInt();
			
			String str = sc.next();
			String result ="";
			for(int i = 0 ; i < str.length() ; i++){
				int asci = str.charAt(i) - 'A';
				char res = (char) (((a * asci + b) % 26) + 'A');
				result += (res+"");
			}
			
			System.out.println(result);
			
		}
	}
}
