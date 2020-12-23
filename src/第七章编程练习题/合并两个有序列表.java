package 第七章编程练习题;
import java.util.Scanner;
public class 合并两个有序列表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list1: ");
		int len1=input.nextInt();
		int[] list1=new int[len1];
		for(int i=0;i<len1;++i) {
			list1[i]=input.nextInt();
		}
		System.out.print("Enter list2: ");
		int len2=input.nextInt();
		int[] list2=new int[len2];
		for(int i=0;i<len2;++i) {
			list2[i]=input.nextInt();
		}
		System.out.print("The merged list is: ");
		int[] TMP=merge(list1,list2);
		for(int i=0;i<TMP.length;++i) {
			System.out.print(TMP[i]+" ");
		}
		
		
	}
	public static int[] merge(int[] list1,int[] list2) {
		int[] Tmp=new int[list1.length+list2.length];
		int tmp=0;
		int i1=0;
		int i2=0;
		while(i1<=list1.length-1 && i2<=list2.length-1) {
			if(list1[i1]<list2[i2]) {
				Tmp[tmp]=list1[i1];
				tmp++;
				i1++;
			}
			else {
				Tmp[tmp]=list2[i2];
				tmp++;
				i2++;
			}
		}
		while(i1<=list1.length-1) {
			Tmp[tmp]=list1[i1];
			i1++;
			tmp++;
		}
		while(i2<=list2.length-1) {
			Tmp[tmp]=list2[i2];
			i2++;
			tmp++;
		}
		return Tmp;
	}
}
