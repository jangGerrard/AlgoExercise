package kr.ac.kw;

import java.util.Scanner;

public class _2438 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		
		for(int i = 1; i <= input ; i++){
			for(int j = 1; j <= input ; j++){
				
				if(input - j < i ){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
