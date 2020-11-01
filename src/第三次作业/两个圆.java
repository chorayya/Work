package 第三次作业;
import java.util.Scanner;
public class 两个圆 {

	public static void main(String[] args) {
		//输入两个圆的中心坐标和各自的半径值
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circlel's center x-, y-coordinates, and radius: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		
		//计算圆心的距离
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
