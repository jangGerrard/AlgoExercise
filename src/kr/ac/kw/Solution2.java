package kr.ac.kw;

import java.util.Scanner;

public class Solution2 {
	static int n;	//r개수
	static int r;	//하나씩 범위
	static int l;	//0~ㅣ까지
	static int in[] ;
	static boolean isCovered[] ;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int t = 1 ; t <= test_case; t++){
			n = sc.nextInt();
			r = sc.nextInt();
			l = sc.nextInt();
			in = new int[n+1];
			
			isCovered = new boolean[1000+1];
			for(int i = 1; i <= n ; i++){
				in[i] = sc.nextInt();
			}
			
			//checkIsCovered();
			for(int i = 1; i <= n ; i++){
				for(int j = 0 ; j <= r ; j++){
					if(in[i] + j >= 0){
						isCovered[in[i] + j] = true;
					}
					if(in[i] - j >= 0){
						isCovered[in[i] - j] = true;
					}
				}
			}
			
			
			int min =0 ;
			boolean isFinished = true;
			for(int i = 0 ; i <= l ; i++){
				isFinished &= isCovered[i];
			}
			
			if(!isFinished){
				//여기에 알고리즘짜야해
				whereIsEmpty();
				
				for(int i =  1 ; i  <= n ; i ++){
					//4개여도, 난리나는데, 
					//그 이상이면 더
					//문제가 될거 같은데
					
				}
				
				
				
			}
			
			System.out.println("Case #"+t);
			System.out.println("여기에 값을 넣어 : " + min);
			
		}
	}
	
	public static int checkIsCovered(){
		int count =0 ;
		for(int i = 1; i < n ; i++){
			int value = in[i];
			for(int j = value ; j <= r+value; j++){
				if( j >= 0 && j <= 1000 ){
					isCovered[j] = true;
				}
				if( (-j) >= 0 && (-j) <= 1000 ){
					isCovered[j] = true;
				}
			}
		}
		return count;
	}
	
	public static void whereIsEmpty(){
		for(int i = 0 ; i <= l ;i++){
			if(!isCovered[i]){
				System.out.println(i);
			}
		}
	}
}
