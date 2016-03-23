package kr.ac.kw;

import java.util.Scanner;

public class SameNumber_codeground {
	static int[] arr = new int[10000];
	static boolean hasResult = false;
	static int result ;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count;
		int testCase = sc.nextInt();
		
		for(int t = 1; t <= testCase; t++){
			//여기부터 구현
			int in = sc.nextInt();
			count = 0 ;
			hasResult = false;
			result = 0;
			for(int i = 2 ; i <= in && !hasResult  ; i++){
				arr = new int[10000];
				sub(i, in, 1);
			}
			
			System.out.println("Case #"+t);
			System.out.println(result);
		}
	}
	
	public static void sub(int n , int num, int count){
		if( num / n  >= n ){
			arr[count] = num % n; 
			sub(n , num / n, count+1);
		} else {
			arr[count] = num % n;
			arr[count+1] = num / n; 
			///끝이면.
			if(checkSameNum(n , count)){
				hasResult = true;
			} else {
				hasResult = false;
			}
		}
	}
	
	public static boolean checkSameNum(int n , int count){
		for(int i = count + 1 ; i >= 2 ; i-- ){
			if(arr[i] != arr[i-1]){
				return false;
			}
		}
		result = n;
		return true;
	}
}
