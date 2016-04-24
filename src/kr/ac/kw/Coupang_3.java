package kr.ac.kw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/////구현을 다 하지 못했습니다.
////알고리즘은 내부에 주석으로 설명해 놓았습니다.
public class Coupang_3 {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		Map<String,Customer> maps = new HashMap<String, Customer>();
		Map<Integer,Item> items = new HashMap<Integer, Item>();
		
		///고객 몇명이 입력받을지를 선택해 주여아 합니다.
		//개인적으로 추가한 부분입니다.!!
		int customerCnt  = sc.nextInt();
		
		///입력 받기
		for(int i = 0 ; i < customerCnt ; i++){
			String input = sc.next();
			String customerId ="";
			Pattern p = Pattern.compile("[A-Z]+");
			Matcher m = p.matcher(input);
			//
			while(m.find()){
				customerId = m.group();
			}
			
			Customer c= new Customer();
			
			p = Pattern.compile("[0-9]+");
			m = p.matcher(input);
			while(m.find()){
				String itemStr = m.group();
				int item = Integer.parseInt(itemStr);
				c.addList(item);
				
				if(items.get(item)== null ){
					items.put(item, new Item(item));
				} else {
					items.get(item).addCustomId(customerId);
				}
			}
			maps.put(customerId, c);
			
		}
		//입력 끝..
		List<Item> lists = new ArrayList<Item>(items.values());
		Collections.sort(lists, new Comparator<Item>(){
			@Override
			public int compare(Item o1, Item o2) {
				if(o1.getItemNum() >= o2.getItemNum()){
					return -1 ;
				} else {
					return 1; 
				}
			}
		});
		
		
		///각 item에 전과 후에 상품이 얼마나 떨어져 있는지를 계산합니다
		lists.get(0).setNextDist(lists.get(1).item - lists.get(0).item);
		for(int i = 1 ; i < lists.size() - 1; i++){
			Item prev = lists.get(i-1);
			Item cur = lists.get(i);
			Item next= lists.get(i+1);
			
			
			cur.setNextDist(next.item - cur.item);
			cur.setPrevDist(cur.item - prev.item);
		}
		
		lists.get(lists.size() ).setPrevDist( lists.get(lists.size() ).item - lists.get(lists.size() ).item -1);

		
		
		
		///각각을 그룹으로 나누고 출력합니다.
		int grp = 1;
		final int maxCnt = 2;
		int beforeCnt = 0;
		int totCnt = 1;
		
		for(int i = 0 ; i < lists.size(); i++){
			Item item = lists.get(i);
			for(int j = 0 ; j <= item.customIds.size() ; j++){
				if(beforeCnt < maxCnt ){
					System.out.print("그룹 : "+grp +"상자 : "+ totCnt +item.customIds.get(j) +item.item );
					beforeCnt ++;
				}  else if(beforeCnt == 2){
					System.out.print(grp + item.item );
					beforeCnt =0;
					grp ++;
				}
				totCnt ++;
			}
		}
		
		
	}
}



///고객의 상품리스트와 상자 갯수를 저장합니다.
class Customer{
	String id;
	List<Integer> prodList;
	List<Integer> packingCount;
	
	public Customer(){
		prodList = new ArrayList<Integer>();
		packingCount = new ArrayList<Integer>();
	}
	
	public Customer(String id){
		this();
		this.id = id;		
	}
	
	public void  addList(int item){
		prodList.add(item);
	}
	
}


///각 상품의 왼쪽과 오른쪽의 인텍스의 차이를 저장하고
// 주문한 고객의 id도 저장합니다.
class Item{
	int item;
	int prevDistance ;
	int nextDist;
	List<String> customIds;
	public Item(int item){
		customIds = new ArrayList<String>();
	}
	
	public int getItemNum(){
		return this.item;
	}
	
	public void addCustomId(String cuid){
		this.customIds.add(cuid);
	}
	
	public void setNextDist(int next){
		this.nextDist = next;
	}
	public void setPrevDist(int prev){
		this.prevDistance = prev;
	}
	
}