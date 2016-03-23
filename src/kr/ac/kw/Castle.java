package kr.ac.kw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Castle {
	
	static char[][] map;
	static boolean[][] selected;
	
	static int min = 0 ; 
	static int n = 0 ;
	static int m = 0 ;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new char[n+1][m+1];
		selected = new boolean[n+1][m+1];
		
		for(int i = 1; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1 ; j <= m ; j++){
				map[i][j] = temp.charAt(j-1);
			}
		}
		initSelected();
		//입력 끝.
		
		
		findCase();
		
		System.out.println("min : "+min);
	}
	
	public static void initSelected(){
		for(int i = 1; i <= n ; i++){
			for(int j = 1 ; j <= m ; j++){
				selected[i][j] = (map[i][j] == 'X' )? true : false;   
			}
		}
	}
	
	public static void findCase(){
		
		for(int i = 1 ; i < n ; i++){
			min = 0 ;
			initSelected();
			for(int j = 1; j < n ; j++){
				if(checkFilled(j,i)){
					selected[i][j] = true;
					min++;
				}
			}
		}
		
		for(int i = 1 ; i < n ; i++){
			for(int j = 1; j < n ; j++){
				//selected
				
			}
		}
		
		
	}
	
	public static boolean checkFilled (int x, int y){
		
		boolean res = false;
		
		//x열에 없는지 확인.
		for(int i =1 ; i <= m ; i++){
			if(selected[y][i]) res = false; 
		}
		//y열에 없는지 확인
		for(int i = 1; i <= n ; i++){
			if(selected[i][x]) res = false;
		}
		
		
		return res ? false : true;
	}
}
