package ��������ҵ;
import java.util.Scanner;
public class ����Բ {

	public static void main(String[] args) {
		//��������Բ����������͸��Եİ뾶ֵ
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circlel's center x-, y-coordinates, and radius: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		
		//����Բ�ĵľ���
		double d=Math.sqrt(Math.abs(x1-x2)*Math.abs(x1-x2)+Math.abs(y1-y2)*Math.abs(y1-y2));
		if(d<=Math.abs(r1-r2)) {
			System.out.println("circle2 is inside circlel");
		}
		else if(d<=r1+r2) {
			System.out.println("circle2 overlaps circlel");
		}
		else
			System.out.println("circle2 does not overlap circlel");

	}

}
