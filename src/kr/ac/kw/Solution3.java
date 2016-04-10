package kr.ac.kw;

import java.util.Scanner;

public class Solution3 {
	
	static int t;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(t = 1; t <= testCase ; t++){
			double p = sc.nextDouble();
			
			
			findMin(p);
		}
		
		
		
	}
	
	public static void findMin(double p ){
		String temp = p+"";
		int n = 1 ;
		while(!isInteger(temp)){
			
			temp = (p*n) + "";
			n++;
		}
		//System.out.println(n);
		
		int[] arr = new int[5+1];
		//n-1이다.
		
		int k = (int)Double.parseDouble(temp);
		findCounts(arr, n - 1, k);
		
		System.out.println("Case #"+t);
		for(int i = 1 ; i <= 5; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static boolean isInteger(String input){
		int dot = -1;
		char[] temp = input.toCharArray();
		for(int i = 0 ; i < temp.length ; i++){
//			System.out.println(i +" : " + temp[i]  );
			if(temp[i] == '.' ){
				dot = i;
				break;
			}
		}
//		System.out.println(dot);
		boolean b;
		int loop =  input.length() < 10 ? input.length() :  dot + 10;
		for(int i = dot + 1; i <  loop  ; i++){
			if (input.charAt(i) != '0')
				return false;
		}
		return true;
	}
	
	public static void findCounts(int[] arr,int  n, int sum){
		arr[5]  = sum / 5;
		sum %= 5;
		arr[4] = sum/4;
		sum %= 4;
		arr[3] = sum/3;
		sum %= 3;
		arr[2] = sum/2;
		sum %= 2;
		arr[1] = sum/1;
		sum %= 1;
		
	}
	
}
