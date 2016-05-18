package com.problems;
import java.util.HashSet;
import java.util.Set;

public class RecordMaker {
	public static void main(String[] args){
		
		if(args.length < 1){
			System.out.println("no args");
			System.out.println("java RecordMaker [count]");
			return;
		}
		int count = 0 ;
		try{
			count = Integer.valueOf(args[0]); 
		}catch(NumberFormatException e){
			System.err.println("NumFormat Illegal");
			e.printStackTrace();
			return;
		}
		
		Set<String> idSet = new HashSet<String>();
		
		for(int i = 0 ; i < count ; i++){
			String idStr = getIdString(idSet);
			int score = (int)(Math.random() * 99);
			System.out.printf("NT%s %02d\n", idStr, score);
		}
		
		
	}

	private static String getIdString(Set<String> idSet) {
		
		boolean maked = false;
		String result ="";
		
		while(!maked){
			int rand = (int) (Math.random() * 99999);
			int singleDigit  = 0;
			for(int i = 1 ; i < 5 ; i++){
				int _10 =(int) Math.pow(10 , i);
				if(rand / _10 == 0 ){
					singleDigit++;
				}
			}
			StringBuilder sBuilder = new StringBuilder();
			for(int i = 0 ; i < singleDigit ; i ++){
				sBuilder.append(0);
			}
			sBuilder.append(rand);
			result = sBuilder.toString();
			if(!idSet.contains(result)){
				idSet.add(result);
				maked = true;
			}
			
		}
		
		return result;
	}
	
	
	

}
