package kr.ac.kw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _2293 {
	static int n ; 
	static int k;
	static int [][] d; 
	static List<Integer> items = new ArrayList<Integer>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		for(int i = 1 ; i<=n ; i++){
			items.add(sc.nextInt());
		}
		
		Collections.sort(items, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 >= o2)
					return 1;
				else 
					return -1;				
			}
		});
		d = new int [(k / items.get(0)) + 1][k+1];
		
		int fin = (k / items.get(0));
		for(int i = 1 ; i  <= fin ; i++	){
			for(int j = 0 ; j <= k ; j++){
				d[i][j] = -1;
			}
		}
		
		
		for(int i = 0 ; i < items.size(); i++){
			int temp = items.get(i);
			d[1][temp] = 1;
		}
		
//		for(int i = 2; i <= fin ;  i ++){
//			for(int j = 0 ; j <= k ; j++){
//				if(d[i-1][k - j] != -1){
//					
//					if(d[i][k-j] == -1){
//						d[i][k-j] = d[i-1][k - j];
//					} else {
//						d[i][k-j]++;
//					}
//				}
//			}
//		}
		for(int i = 2; i <= fin ;  i ++){
			for(int j = 0 ; j <= k ; j++){
				int _sum = k-j;
				for(int l = 0 ; l < items.size() ; l++){
					int item = items.get(l);
					int temp = _sum - item;
					if(temp > 1  ){
						if(d[i-1][temp] != -1){
							if(d[i][k-j] == -1){
								d[i][k-j] = d[i-1][temp];
							} else {
								d[i][k-j] += d[i-1][temp];
							}
						}
					}
				}
			}
		}
		
		
		int res=0;
		for(int i = 1 ; i <= fin ; i++){
			if(d[i][k] != -1){
				res+=d[i][k];
			}
		}
		System.out.println(res);
	}
}
