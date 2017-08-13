package test;
/*
 *排序砖块有几种只有一种不同颜色的砖块挨着的方式，例如"ABAB",只有"AABB"与"BBAA"满足要求
 */
 

import java.util.HashMap;
import java.util.Scanner;

public class ABAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		String str=n.next();
		//String str ="2342asfghgyu56asdasda";        
		HashMap<String,Integer> maps = new HashMap<String,Integer>();  
		for(int i=0;i<str.length();i++){         
			String key = String.valueOf((str.charAt(i)));    
			if(!maps.containsKey(key))  
				maps.put(key, 1);     
			else{        
				int val =maps.get(key);     
				maps.put(key, val+1);        
				}               
			}  
		if(maps.size()>=3||maps.size()==0)
		{
			System.out.println("0");   
		}
		else if(maps.size()==2)
		{
			System.out.println("2");   
		}
		else 
		{
			System.out.println("1");  
			
		}
		


	}

}
