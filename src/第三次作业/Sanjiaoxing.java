package 第三次作业;
//3.19
import java.util.Scanner;
public class Sanjiaoxing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入三条边的值： ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a + b > c && a + c > b && b + c >a)
			System.out.println(a+b+c);
		else
			System.out.println("输入值不合法");
	
	}
	}
