package ��������ҵ;
import java.util.Scanner;
public class ���Ƿ���Բ�� {
	public static void main(String[] args) {
		//��ʾ�û�����һ����
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextInt();
		double y = input.nextInt();
		
		//�����Ƿ���Բ��,�����
		double d;
		d=Math.pow(x*x+y*y, 0.5);
		if(d<=10)
			System.out.print("Point (" + x + ", " + y + ") is in the circle");
		else
			System.out.print("Point (" + x + ", " + y + ") is not in the circle");
			
		
		
	}
}
