package com.jennifer.jgjang0202;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.sun.javafx.geom.Path2D;

public class _C {
	
	//입력 저장 배열
	static List<Point2> list = new ArrayList<Point2>();
	//최적의 결과 저장 배열
	static List<Point2> finalPath = new ArrayList<Point2>();
	static double min =9999;
	static int n ;
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 
		 for(int i = 1; i <= n ; i++){
			 int x = sc.nextInt();
			 int  y = sc.nextInt();
			list.add(new Point2(x,y));
		 }
		 
		 
		 //완전 탐색으로 모든 경우를 보고 최소의 길이를 찾습니다.
		 List<Point2> pathList  = new ArrayList<Point2>();
		 boolean[] path = new boolean[10 + 1];
		 pathList.add(new Point2(0,0));
		 dfs( pathList ,path , 1 , 0.0 );
		 
		 //Print result
		 System.out.print(finalPath.get(0).toString());
		 for(int i = 1 ; i< finalPath.size(); i++){
			 System.out.print(" -> "+finalPath.get(i).toString());
		 }

	}
	
	public static void dfs( List<Point2> pathList, boolean[] path , int depth, double sum){
		
		//마지막 까지 찾은 경우//
		if(depth> n ){
			Point2 p = new Point2(10,10);
			Point2 temp = pathList.get(pathList.size() -1 ) ;
			double res = Math.sqrt(Math.pow(p.x - temp.x, 2) + Math.pow(p.y - temp.y, 2));
			sum += res;
			
			if(min > sum ){
				finalPath.clear();
				min = sum;
				for(int i = 0 ; i< pathList.size(); i++){
					finalPath.add(pathList.get(i));
				}
				finalPath.add(p);
			}
		}
		
		for(int i = 0 ; i < n ; i++){
			
			Point2  p  = list.get(i);
			if(!path[i] ){
				
				Point2 temp = pathList.get(pathList.size() -1 ) ;
				double res = Math.sqrt(Math.pow(p.x - temp.x, 2) + Math.pow(p.y - temp.y, 2));
				List<Point2> newPathList = new ArrayList<Point2>();
				boolean[] newPath = new boolean[ 10 + 1];
				
				pathcopy(path, newPath);
				newPathListCopy(pathList, newPathList);
				newPathList.add(p);
				newPath[i] = true;
				
				dfs(newPathList, newPath, depth + 1, sum + res);
			}
		}
	}

	private static void pathcopy(boolean[] path, boolean[] newPath) {
		for(int i = 0 ; i < 11 ; i ++){
			newPath[i] = path[i];
		}
	}
	
	private static void newPathListCopy(List<Point2> oldPath , List<Point2> newPath){
		for(int i = 0 ; i < oldPath.size() ;i++){
			newPath.add(oldPath.get(i));
		}
	}
	
	
	
}
class Point2{
	public int x; 
	public int y ; 
	public Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "(" + this.x+", "+this.y+")";
	}
}