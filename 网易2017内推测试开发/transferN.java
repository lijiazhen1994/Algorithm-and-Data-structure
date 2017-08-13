package test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
/*
 * 第二题
 * 执行n次，每次插入B数组一个数，逆序数出结果
 * 结果用空格分割，最后一个数无空格
 *case通过50%，说是时间超出限制，或计算太过复杂，内存超出限制
 *可能用栈实现这道题或是通过找规律，据说用二维矩阵case能通过100%
 */

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


		
		



