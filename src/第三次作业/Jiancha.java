package 第三次作业;
//编程练习题3.9
import java.util.Scanner;
public class Jiancha {
	public static void main(String[] args) {
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		//先输入前九个数
		Scanner input = new Scanner(System.in);
		int d = input.nextInt();
		int d1 = d /100000000 %10;
		int d2 = d /10000000 %10;
		int d3 = d /1000000 %10;
		int d4 = d /100000 %10;
		int d5 = d /10000 %10;
		int d6 = d /1000 %10;
		int d7 = d /100 %10;
		int d8 = d /10 % 10;
		int d9 = d % 10;
		
		
	
		//计算的d10校验和
		int d10;
		d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11;
		
		//输出
		if (d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 +"X");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
	
	}
}
