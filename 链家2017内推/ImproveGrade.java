package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ImproveGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList(); //n 
		 Scanner in = new Scanner(System.in);
		 Scanner in2 = new Scanner(System.in);//r
		 Scanner avg= new Scanner(System.in);//avg
				         int n = in.nextInt();
				         int r = in2.nextInt();//����
				         int average= avg.nextInt();
				         int numin []=new int [n];
				         int numout []=new int [n];
				         int sum=0;
				         for (int i=0;i<n;i++)
				     	{
				        	 numin[i]=in.nextInt(); 
				        	 numout[i]=in.nextInt();
				        	 sum=sum+numin[i];
				    
				     	}
				         
				         
				 
    //�����ƽ���ֵĲ�ֵ
		int number=n*average-sum;
		
		System.out.println("��ֵ"+number);
		int tihao=0;
		HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();  
		 for (int k=0;k<n;k++)
	     {
			 maps.put(numout[k],tihao);
        	 tihao++;
	     }
		 Object[] key =  maps.keySet().toArray();    
		 Arrays.sort(key);    
		   
		 for(int i = 0; i<key.length; i++)  
		 {    
		      System.out.println(maps.get(key[i]));    
		 }  
		 int z=0;
		 int cost=0;
		 while(number>0)
		 {
			 int timuhao=maps.get(key[z]);
			 System.out.println("������Ŀ��"+timuhao);
			 int first=r-numin[timuhao];  
			 System.out.println("���ӷ�ֵΪ"+first);
			 if(first>=number)
			 {
				 cost=cost+number*numout[timuhao];
				 System.out.println("cost"+cost);
				 break;
			 }
			 else{
				 number=number-first;
				 cost=cost+first*numout[timuhao];
				 System.out.println("cost"+cost);
			 }
			 z++;
		 }
		 
		 System.out.println(cost);
	}

}
