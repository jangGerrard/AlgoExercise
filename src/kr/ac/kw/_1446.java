package kr.ac.kw;

import java.util.Scanner;

public class _1446 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int d = sc.nextInt();
		int arr[][] = new int[d+1][d+1];
		int dy[] = new int [d+1];
		
		for(int i = 0 ; i <= d ; i++){
			for(int j = 0; j <= d ; j++){
				arr[i][j] = 99999;
			}
		}
		for(int i = 0; i <= d ; i++){
			dy[i] = 99999;
		}
		
		
		for(int i = 1; i <= n ; i++){
			int s = sc.nextInt();
			int e = sc.nextInt();
			int l  = sc.nextInt();
			if(s >= 0 && s <= d && e >= 0 && e <= d){
				if(arr[s][e] > l){
					arr[s][e] = arr[e][s] = l;
				}
			}
		}
		
		
		
		//solve
		dy[0] = 0;
		for(int i = 1; i <= d ; i++){
			for(int j = 0 ; j <= d ; j++){
				///뭐냐면.,
				
				///
				if(arr[i][j] != 99999){
					if(arr[i][j] + dy[j] < dy[i])
						dy[i] = arr[i][j] + dy[j];
				} else {
					if(dy[i-1] + 1 < dy[i])
						dy[i] = dy[i-1] + 1;
				}
			}
		}
		
		System.out.println(dy[d]);
		
	}
}
