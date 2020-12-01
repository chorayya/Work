package 第七章编程练习题;
import java.util.Scanner;
public class 冒泡排序 {

	public static void main(String[] args) {
		//输入十个数
		System.out.print("输入十个数：");
		Scanner input=new Scanner(System.in);
		double[] list=new double[9];
		for(int i=0;i<9;++i) {
			list[i]=input.nextDouble();
		}
		bubbleSort(list);
		for(int i=0;i<9;++i) {
			System.out.print(list[i] +" ");
		}
	
	}

	//冒泡排序方法
	public static void bubbleSort(double[] list) {
		for(int i=0;i<list.length-1;++i) {
			for(int j=0;j<list.length-i-1;++j) {
				if(list[j]>list[j+1]) {//如果前面的数大于后面的数，交换位置
					double temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
	}
}
