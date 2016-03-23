package kr.ac.kw;

import java.util.Scanner;

public class RGBDistance {
	
	public static int[][] in; 
	public static int[][] d;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		in = new int[n+1][4];
		d =  new int[n+1][2];
		for(int i = 1 ; i <= n ; i++){
			in[i][1] = sc.nextInt();
			in[i][2] = sc.nextInt();
			in[i][3] = sc.nextInt();
		}
		//d[?][0] ->min값
		//d[?][1] ->rgb값
		
		d[1][0] = in[1][1];
		d[1][1] = 1;
		if(in[1][2] < d[1][0]){
			d[1][0] = in[1][2];
			d[1][1] = 2;
		}
		if(in[1][3] < d[1][0]){
			d[1][0] = in[1][3];
			d[1][1] = 3;
		}
		
		//아래로 가면서 중복되지 않게 하는 것과 같은문제네,
		for(int i = 2; i <= n ; i++){
			long min=99999999999L ;
			for(int j = 1 ; j <= 3 ; j++){
				if(j != d[i-1][1]){ //전에꺼랑 색깔 안겹쳐
					if(min > d[i-1][0] + in[i][j] ){
						d[i][0] = d[i-1][0] + in[i][j];
						d[i][1] = j;
						min = d[i][0];
					}
				}
			}
		}
		System.out.println("res : " + d[n][0]);
	}
}
