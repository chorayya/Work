package �����±����ϰ��;
import java.util.Scanner;
public class �Ƿ��ź����� {

	public static void main(String[] args) {
		int[] list=new int[100];
		System.out.println("Enter list: ");
		Scanner input=new Scanner(System.in);
		int n;//n���б���Ԫ�صĸ���
		n=input.nextInt();
		for(int i=0;i<n;++i) {
			list[i]=input.nextInt();
		}
		if(isSorted(list,n)) 
			System.out.print("The list is already sorted");
		else
			System.out.print("The list is not sorted");
	}
	public static boolean isSorted(int[] list,int n) {
		
		boolean flag=true;
		for(int i=0;i<=n-2;i++) {
				if(list[i]<=list[i+1]) 
					flag=true;
				else {
					flag=false;
					break;}
					
			}
		
		return flag;
	}
}

