package 第三次作业;
import java.util.Scanner;
public class 点是否在三角形内 {
	public static void main(String[] args) {
		//提示用户输入一个点
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//计算是否在三角形,并输出
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
