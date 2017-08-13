package test;
/*
 *拼多多第一题：找出3个数相乘最大
 *笔试时忘考虑数组中含有0的情况，case通过率22.22%
 *总共分为3种情况：
 *第一种为最大的3个数相乘，即全为正数时最大的3个数相乘。
 *第二种情况是有最下的两个负数相乘能把负号抵消了，同时乘以最大的正数
 *第3种情况是为0的情况，输出为0
 */
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class mutiple {

	public static void main(String[] args)  
    {  
		System.out.println(myPrint());
	
   } 
	//定义函数  
    public static int myPrint()
    {
    	System.out.println("请输入数字个数：");
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int[] array=new int[num];		
		for(int i=0;i<array.length;i++){
			array[i]=in.nextInt();
		}
	
		Arrays.sort(array);
		int product1 = 1;
		int product2 = 1;
		int array_n_element = array.length - 1;
       /*
        * 考虑输入的数组中有0的情况
        */
		for(int j=0;j<array.length;j++){
			if(array[j]==0)
			{
				return 0;
			}
				 
		}
		
		for (int x = array_n_element; x > array_n_element - 3; x--) {
		  product1 = product1 * array[x];
		}
	   product2 = array[0] * array[1] * array[array_n_element];
	   if (product1 > product2){
		  return product1;
	   }else{
		   return product2;
	   }
     
    }

}
