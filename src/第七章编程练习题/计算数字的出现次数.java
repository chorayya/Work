package �����±����ϰ��;
import java.util.Scanner;
public class �������ֵĳ��ִ��� {

	public static void main(String[] args) {
		//��������
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
