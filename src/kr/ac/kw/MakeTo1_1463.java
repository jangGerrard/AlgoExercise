package kr.ac.kw;

import java.util.Scanner;

public class MakeTo1_1463 {
	public static void tt(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] d = new int[n +1];
		d[1] = 0 ;
		for(int i = 2 ; i <= n ; i++){
			d[i] = d[i-1] + 1;
			if(i % 2 == 0 ){
				d[i] = d[n/2] + 1;
			} else if (i % 3 == 0 ){
				d[i] = d[n/3] + 1;
			} else {
				d[i] = d[n-1] + 1;
			}
		}
		
		System.out.println(d[n]);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		d[1] = 0;
		for (int i = 2; i <= n; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
				d[i] = d[i / 2] + 1;
			}
			if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
				d[i] = d[i / 3] + 1;
			}
		}
		System.out.println(d[n]);
	}

}
