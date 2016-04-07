package kr.ac.kw;

import java.util.Scanner;

public class _1799 {
	static int n;
	static int[][] in;
	static int[][] temp;
	static int max =  0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		in = new int[n+1][n+1];
		temp = new int[n+1][n+1];
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		int res = 0;
		int max=0 ;
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				initTemp();
				if(temp[i][j] == 1){
					res = place(i, j, 1 );
					if(res > max){
						max = res;
					}
				}
			}
		}
		
		System.out.println(max);
		
		
	}
	
	public static int place(int y , int x, int count){
		
		temp[y][x] = 0;
		int max = 0;
		int retVal = 0 ;
		for(int i = y,j = x; i<=n && j<= n ; j++,i++){
			temp[i][j] = 0;
		}
		
		for(int i =y ,j = x; i>=1 && j>= 1 ; j--, i--){
			temp[i][j] = 0;
		}
		
		for(int i =y ,j = x; i>=1 && j>= 1 ; j--, i--){
			temp[i][j] = 0;
		}
		
		for(int i =y ,j = x; i>=1 && j <= n ; j++, i--){
			temp[i][j] = 0;
		}
		for(int i =y ,j = x; i <= n && j>= 1 ; j--, i++){
			temp[i][j] = 0;
		}
		
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				
				if(isFin()){
					return count;
				}
				
				if(temp[i][j] == 1){
					///여기서 놓는 순간 count1개 올라가는 거다.
					retVal = place(i,j,count+1);
//					if(retVal == 7){
//						System.out.println("ret9");
//					}
//					System.out.println("ret : " + retVal);
					max = max < retVal ? retVal : max;
				}
				
				
			}
		}
		return max;
	}
	
	public static boolean isFin(){
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				if(temp[i][j] == 1){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void initTemp(){
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				temp[i][j] = in[i][j];
			}
		}
	}
}
