package test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class transferN {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();  
		 Scanner in = new Scanner(System.in 

 );
				         int n = in.nextInt();
				         int numin []=new int [n];
				         int numout []=new int [n];
				         for (int i=0;i<n;i++)
				     	{
				        	 numin[i]=in.nextInt();
				        	 numout[i]=0;
				     	}
				         for (int i=0;i<n;i++)
					     {
				        	 arrayList.add(numin[i]);  
				        	 Collections.reverse(arrayList);  
					     }
				         
				         for (int i=0;i<n-1;i++)
					     {
				        	 System.out.print(arrayList.get(i));
				        	 System.out.print(" ");
					     }
				         System.out.print(arrayList.get(n-1));
				     }

	}

//	public static void main(String[] args) {
//		//ArrayList arrayList = new ArrayList();  
//		 Scanner in = new Scanner(System.in );
//				         int n = in.nextInt();
//				         int numin []=new int [n];
//				         int numout []=new int [n];
//				         for (int i=0;i<n;i++)
//				     	{
//				        	 numin[i]=in.nextInt();
//				        	 numout[i]=0;
//				     	}
//				         for (int i=0;i<n;i++)
//					     {
//				        	 numout[i]= numin[i];
//				        	 for(int j=0;j < (i+1) / 2;j++){ 
//				     	        int temp = numout[j];  
//				     	        numout[j] = numout[i-j];  
//				     	        numout[i-j] = temp;  
//				     	    }  
//					     }
//				         
//				         for (int i=0;i<n-1;i++)
//					     {
//				        	 System.out.print(numout[i]);
//				        	 System.out.print(" ");
//					     }
//				         System.out.print(numout[n-1]);
//				     }


		
		



