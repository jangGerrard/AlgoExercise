package kr.ac.kw;

import java.util.Scanner;

public class _4883 {
	static int[][] in;
	static int[][] d;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for(int t= 1 ; t <= test_case ; t++){
			
			int row = sc.nextInt();
			
			in = new int[row+1][3+1];
			d = new int[row+1][3+1];
			
			for(int i = 1 ; i<= row ; i++){
				for(int j = 1; j <= 3 ; j++){
					in[i][j] = sc.nextInt();
				}
			}
			int _0 = sc.nextInt();
			
			d[1][1] = in[1][1];
			d[1][2] = in[1][2];
			d[1][3] = in[1][3] + in[1][2];
			int temp1, temp2;
			for(int i = 2 ; i<=row ; i++){
				d[i][1] = Math.min(d[i-1][1] + in[i][1], d[i-1][2] + in[i][1]);
				
				temp1 = Math.min(d[i-1][1] + in[i][2], d[i-1][2] + in[i][2]);
				temp2 = Math.min(d[i][1] + in[i][2] , d[i-1][3] + in[i][2]);
				d[i][2] = Math.min(temp1, temp2);
				
				d[i][3] = Math.min(d[i-1][2] + in[i][3], d[i-1][3] + in[i][3]);
			}
			
			
			
			
			System.out.printf("%d. %d",t, d[row][2]);
		}
	}
}
