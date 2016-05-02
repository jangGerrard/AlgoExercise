package kr.ac.kw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _9465 {
	static int in[][] = new int[100000+1][3];
	static int d[][] = new int[100000+1][3];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int No = 0;
		final int Up = 1;
		final int Down = 2;

		int test_case = Integer.valueOf(br.readLine());
		
		for(int t = 1; t <= test_case ; t++){
			int n  = Integer.valueOf(br.readLine());
			
			String line[] = br.readLine().split(" ");
			for(int i = 1 ; i <= n ; i ++){
				in[i][1] = Integer.valueOf(line[i-1]);
			}
			line = br.readLine().split(" ");
			for(int i = 1 ; i <= n ; i ++){
				in[i][2] = Integer.valueOf(line[i-1]);
			}
			
			d[1][0] = 0;
			d[1][Up] = in[1][Up];
			d[1][Down] = in[1][Down];
			
			for(int i = 2 ; i <= n ; i++){
				
				int lowerMax = 0;
				for(int j = 0; j <3 ; j++){
					if(lowerMax < d[i-1][j]){
						lowerMax = d[i-1][j];
					}
				}
				d[i][No] = lowerMax;
				d[i][Up] = Math.max( d[i-1][No] , d[i-1][Down] ) + in[i][Up];
				d[i][Down] = Math.max(d[i-1][No] , d[i-1][Up] ) + in[i][Down];
			}
			
			int max = 0;
			for(int i = 0 ; i < 3; i ++){
				if(d[n][i] > max){
					max = d[n][i];
				}
			}
			
			System.out.println(max);
		}
	}
}
