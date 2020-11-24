package 第七章编程练习题;
import java.util.Scanner;
public class 计算数字的出现次数 {

	public static void main(String[] args) {
		//输入整数
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] myList=new int[101];
		int m=input.nextInt();
		for(int i=1;i<=100;++i) {
			myList[i]=0;
		}
		while(m!=0) {
			myList[m]+=1;
			m=input.nextInt();
		}
		
		for(int i =1;i<=100;++i) {
			if(myList[i]!=0) {
				System.out.println(i+" occurs "+ myList[i]+" times" );
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
