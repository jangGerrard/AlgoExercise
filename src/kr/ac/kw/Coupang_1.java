//package kr.ac.kw;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
////Coupang is the fastest growing e-commerce company and comtinuing to gain growth momentum 
////At the same time, Coupang is now conquering Korea.
//
//
//public class Coupang_1 {
//	
//	public static void main(String[] args){
//		Map<String, _Packing> maps = new HashMap<String, _Packing>();
//		Scanner sc = new Scanner(System.in);
//		String[] strArr =new String[10000+1];
//		
//		String input = sc.nextLine();
//		strArr = input.split(" ");
//		for(int j = 0 ; j < strArr.length; j++){
//			strArr[j] = strArr[j].toLowerCase();
//			
//			Pattern p = Pattern.compile("[a-z]+"); // Pattern p  = Pattern.compile("[a-z]+");
//			Matcher m = p.matcher(strArr[j]); 		///Matcher m = p.matcher("string");
//			String temp = "";  							//while(m.find()) { m.group() /// 이게 결과야 }
//			while(m.find()){
//				temp += m.group();
//			}
//			strArr[j] = new String(temp);
//		}
//		
//		for(int i = 0 ; i < strArr.length ; i++	 ){
//			int firstIdx = 0;
//			int lastIdx = strArr[i].length()-1;
//			
//			String key = (""+strArr[i].charAt(firstIdx)) + strArr[i].charAt(lastIdx) + "";
//			
//			if(maps.get(key) == null ) {
//				maps.put(key, new _Packing(key + "", 1));
//			} else {
//				maps.get(key).countUp();
//			}
//		}
//		
//		
//		List<_Packing> lists = new ArrayList<_Packing>(maps.values());
//		Collections.sort(lists, new Comparator<_Packing>(){
//			@Override
//			public int compare(_Packing l, _Packing r) {
//				
//				if(l.getCount() > r.getCount()){
//					return -1;
//				}else  if(l.getCount() > r.getCount()){
//					char[] lStr = l.getKey().toCharArray();
//					char[] rStr = r.getKey().toCharArray();
//					for(int i = 0 ; i < lStr.length ; i++){
//						if(lStr[i] >= rStr[i] ){
//							return 1;
//						} else {
//							return -1;
//						}
//					}
//				} else {
//					return 1 ;
//				}
//				return 0;
//			}
//			
//		});
//		
//		
//		for(int i = 0 ; i < lists.size(); i++){
//			System.out.println(lists.get(i).toString());
//		}
//		
//		
//	}
//}
//
//class _Packing{
//	private String key ; 
//	private int count ; 
//	public _Packing(String key , int count ){
//		this.key = key ;
//		this.count = count;
//	}
//	
//	public String getKey(){
//		return this.key;
//	}
//	
//	public void countUp(){
//		this.count += 1;
//	}
//	
//	public int getCount(){
//		return this.count;
//	}
//	
//	public String toString(){
//		return key + ", " + count;
//	}
//}
