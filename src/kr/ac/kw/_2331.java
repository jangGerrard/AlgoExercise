package kr.ac.kw;

import java.util.Scanner;

public class _2331 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		int d[] = new int[100000];
		int c[] = new int[100000];
		boolean isFinished =false ;
		d[1] = p;
		for(int i = 2; !isFinished; i++  ){
			int temp = d[i-1];
			int _1000 = temp / 1000; temp -= _1000* 1000;
			int _100 = temp / 100; temp -= _100* 100;
			int _10 = temp / 10; temp -= _10* 10;
			int _1 = temp / 1;
		}
		
	}
}
