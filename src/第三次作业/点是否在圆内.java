package 第三次作业;
import java.util.Scanner;
public class 点是否在圆内 {
	public static void main(String[] args) {
		//提示用户输入一个点
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextInt();
		double y = input.nextInt();
		
		//计算是否在圆内,并输出
		double d;
		d=Math.pow(x*x+y*y, 0.5);
		if(d<=10)
			System.out.print("Point (" + x + ", " + y + ") is in the circle");
		else
			System.out.print("Point (" + x + ", " + y + ") is not in the circle");
			
		
		
	}
}
