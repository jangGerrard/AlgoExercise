package kr.ac.kw;

import java.util.Scanner;

public class Solution4 {
	
	static int[] d;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int test_case = sc.nextInt();
		for(int t = 1;  t <= test_case ; t++){
			int n  = sc.nextInt();
			d = new int[n+1];
			d[1] = 4;
			d[2] = 7;
			for(int i = 3; i <= n ; i++){
				int j ;
				if(i % 2 == 0 ){//짝수
					j = i / 2 -1;
					d[i] = d[j] * 10 + 7;
				} else {	//홀수
					j = i / 2;
					d[i] = d[j] * 10 + 4;
				}
			}
			System.out.println("Case #"+t);
			System.out.println(d[n]);
			
		}
		
		
	}
}
