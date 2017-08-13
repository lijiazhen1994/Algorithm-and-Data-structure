package exercise;
/**
 * Stack类
 * 栈：桶型或箱型数据类型，后进先出，相对堆Heap为二叉树类型，可以快速定位并操作
 * Stack<E>，支持泛型
 * public class Stack<E> extends Vector<E>
 * Stack的方法调用的Vector的方法，被synchronized修饰，为线程安全(Vector也是)
 * Stack methods：
 * push : 把项压入堆栈顶部 ，并作为此函数的值返回该对象
 * pop : 移除堆栈顶部的对象，并作为此函数的值返回该对象 
 * peek : 查看堆栈顶部的对象，，并作为此函数的值返回该对象，但不从堆栈中移除它
 * empty : 测试堆栈是否为空 
 * search : 返回对象在堆栈中的位置，以 1 为基数 
 * */

/*习题：
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 *
 */

/*
 * 【思路】借用一个辅助的栈，遍历压栈顺序，先讲第一个放入栈中，这里是1，然后判断栈顶元素是不是出栈顺序的第一个元素，这里是4，很显然1≠4，所以我们继续压栈，直到相等以后开始出栈，出栈一个元素，则将出栈顺序向后移动一位，直到不相等，这样循环等压栈顺序遍历完成，如果辅助栈还不为空，说明弹出序列不是该栈的弹出顺序。 
 *举例： 
 *入栈1,2,3,4,5 
 *出栈4,5,3,2,1 
 *首先1入辅助栈，此时栈顶1≠4，继续入栈2 
 *此时栈顶2≠4，继续入栈3 
 *此时栈顶3≠4，继续入栈4 
 *此时栈顶4＝4，出栈4，弹出序列向后一位，此时为5，,辅助栈里面是1,2,3 
 *此时栈顶3≠5，继续入栈5 
 *此时栈顶5=5，出栈5,弹出序列向后一位，此时为3，,辅助栈里面是1,2,3 
 *…. 
 *依次执行，最后辅助栈为空。如果不为空说明弹出序列不是该栈的弹出顺序。
 */
import java.util.Stack;

public class testStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		int[] b={4,5,3,2,1};
		System.out.println(IsPopOrder(a,b));
	}
    
		public static boolean IsPopOrder(int [] pushA,int [] popA) {
			if(pushA.length == 0 || popA.length == 0)
				return false;
			Stack<Integer> s = new Stack<Integer>();
			//用于标识弹出序列的位置
			int popIndex = 0;
			for(int i = 0; i< pushA.length;i++){
				s.push(pushA[i]);
				//如果栈不为空，且栈顶元素等于弹出序列
				while(!s.empty() &&s.peek() == popA[popIndex])
				{
					//出栈
					s.pop();
					//弹出序列向后一位
					popIndex++;
					}
				}
			return s.empty();
			}
}
