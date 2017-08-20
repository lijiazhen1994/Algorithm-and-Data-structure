package exercise;
/*链家网第3题*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in 

				);
						int N = sc.nextInt();
						int[] arr = new int[N];
						int ones = 0, twos = 0, threes = 0;
						for(int i = 0; i < N; i++){
							arr[i] = sc.nextInt();
							if(arr[i] == 1){
								ones++;
							}else if(arr[i] == 2){
								twos++;
							}else{
								threes++;
							}
						}
						int count = 0;
						int i = 0,j = 0, k = 0;
						while(j < ones){
							if(arr[i] == 1){
								j++;
								if(i != k){
									arr[i] = arr[k];
									arr[k] = 1;
									count++;
								}
								k++;
							}
							i++;
						}
//						System.out.println(count);
						i = ones;
						j = 0;
						k = ones;
						while(j < twos){
							if(arr[i] == 2){
								j++;
								if(i != k){
									arr[i] = arr[k];
									arr[k] = 2;
									count++;
								}
								k++;
							}
							i++;
						}
						System.out.println(count);
	}

}
