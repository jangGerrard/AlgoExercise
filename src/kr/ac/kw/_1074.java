package kr.ac.kw;

import java.util.Scanner;

public class _1074 {
	
	static int n;
	static int r ;
	static int c;
	static int [][] arr;
	static int level = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		int n2 = (int)Math.pow(2, n);
		arr = new int[n2+1][n2+1];
		
		reculsive(1,n2,1,n2);
		
		System.out.println(arr[r+1][c+1]);
	}
	
	public static void reculsive(int left , int right , int top , int bottom){
		if(right- left !=  1){
			reculsive(left, (left -1)+ right/ 2 , top, top + bottom/ 2);
			reculsive((left -1) +right/ 2 + 1, right , top, top + bottom/ 2);
			reculsive(left, (left -1) +right/ 2 , top + bottom/2 + 1, bottom);
			reculsive((left -1) + right/ 2 + 1, right ,( top -1)  + bottom/2 + 1, bottom);
		} else {
			int first = level * 4;
			arr[top][left] = first;
			arr[top][right] = first+1;
			arr[bottom][left] = first+2;
			arr[bottom][right] = first+3;
			level ++;
		}
	}
}
