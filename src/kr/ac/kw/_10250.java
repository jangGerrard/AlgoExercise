package kr.ac.kw;

import java.util.Scanner;

public class _10250 {
	public static void main(String[] args	){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 1; i <= testCase ; i++){
			int h =sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int wid = n / h  + 1;
			int floor = n % h ;
			String res = floor +"";
			res += (wid < 10 ? "0" + wid : wid); 
			System.out.println(res);
		}
	}
}
