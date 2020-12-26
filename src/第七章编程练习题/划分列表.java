package 第七章编程练习题;
import java.util.Scanner;
import java.util.Arrays;
public class 划分列表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list: ");
		int len=input.nextInt();
		int[] list=new int[len];
		for(int i=0;i<len;++i) {
			list[i]=input.nextInt();
			
		}
		int in=partition(list) ;
		int[] lis=new int[list.length];
		for(int i=0,j=list.length-1,k=0;k<list.length;k++) {
			if(list[k]<list[in]) {
				lis[i]=list[k];
				i++;
			}
			else if(list[k]==list[in]) {
				lis[i]=list[k];
				i++;
			}
			else if(list[k]>list[in]) {
				lis[j]=list[k];
				j--;
			}
		}
		System.out.print("After the partition.the list is ");
		for(int i=0;i<lis.length;++i) {
			System.out.print(lis[i]+" ");
		}
	}
	
	
	public static int partition(int[] list) {
		
		int n=list[0];
		int v=0;
		java.util.Arrays.sort(list);
		for(int i=0;i<list.length;++i) {
			if(list[i]==n) {
				v=i;
				break;
			}
		}
		return v;
	}

}
