package ��������ҵ;
import java.util.Scanner;
public class ���Ƿ����������� {
	public static void main(String[] args) {
		//��ʾ�û�����һ����
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//�����Ƿ���������,�����
		if(x!=200) {
			if((-0.5<=-1*y/(200-x) && -1*y/(200-x)<=0 )&& (x>=0&&x<200))
					System.out.println("The point is in the triangle");
			else
				System.out.println("The point is not in the triangle");
			
		}
		else {
			if(y!=0)
				 System.out.println("The point is not in the triangle");
			else
				 System.out.println("The point is in the triangle");
		}
			
			
		
		
	}
}
