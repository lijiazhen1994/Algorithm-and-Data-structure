package exercise;
/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 基本思路：
 * 首先我们选择从左下角开始搜寻，(为什么不从左上角开始搜寻，左上角向右和向下都是递增，那么对于一个点，对于向右和向下会产生一个岔路，不一定是向下走还是向右走）
 * 如果我们选择从左下脚开始搜寻的话，如果大于就向右，如果小于就向下)。
 */
public class TwoDimArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] a=new int [3][3];
		//二维数组可只定义行，而不定义列，反之则不然     
	    // float f3[][] = new float[][3];  //此种方法错误   
		// float [][]f5 = new float[3][];  //可以只指定行 而不指定列,可以用来定义不规则二维数组
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int s=9;
		System.out.println(Find(a,9));
	}
	
	public static boolean Find(int [][] array,int target) {
		int len = array.length-1;//行向量，行数减一
		        int i = 0;
		        while((len >= 0)&& (i < array[0].length)){
		            if(array[len][i] > target){
		                len--;
		            }else if(array[len][i] < target){
		                i++;
		            }else{
		                return true;
		            }
		        }
		        return false;
		    }

}
