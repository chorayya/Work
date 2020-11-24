package 第七章编程练习题;
import java.util.Scanner;
public class 打印不同的数 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] myList=new int[10];
		int m=input.nextInt();
		myList[0]=m;
		boolean flag=true;
		int i=1;
		int index=0;
		while(i<10) {
			m=input.nextInt();
			for(int j=0;j<myList.length;++j) {
				if(m==myList[j]) flag=false;
					
			}
			if(flag) {
				index++;
				myList[index]=m;
			}
			
			++i;
			flag=true;
		}
		int sum=index+1;
		System.out.println("The number of distinct number is "+sum);
		System.out.print("The distinct numbers are: ");
		for(int t=0;t<=index;++t) {
			System.out.print(myList[t]+" ");
		}
		
		
		
	

	}

}
