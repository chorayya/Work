package ��������ҵ;
import java.util.Scanner;
public class ���Ƿ��ھ����� {
	public static void main(String[] args) {
		//��ʾ�û������
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//�����Ƿ��ھ�����,�����
		if(-5<=x && x<=5 && -2.5<=y && y<=2.5)
			System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
		else
			System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
			
		
		
	}
}
