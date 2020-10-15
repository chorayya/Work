package 第三次作业;
//3.11编程练习题
import java.util.Scanner;
public class Zongtianshu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		//输入月份和年份
		System.out.print("输入月份和年份： ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		//这个月的天数
		int day;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day=31;
		}
		else if(month==2) {
			if(year%400==0||(year%4==0 && year%100!=0)){
				day=29;
			}
			else
				day=28;
		}
		else
			day=30;
		
		//输出
		if (month == 1)
			System.out.print("January ");
		else if (month == 2)
			System.out.print("February ");
		else if (month == 3)
			System.out.print("March ");
		else if (month == 4)
			System.out.print("April ");
		else if (month == 5)
			System.out.print("May ");
		else if (month == 6)
			System.out.print("June ");
		else if (month == 7)
			System.out.print("July ");
		else if (month == 8)
			System.out.print("August ");
		else if (month == 9)
			System.out.print("September ");
		else if (month == 10)
			System.out.print("October ");
		else if (month == 11)
			System.out.print("November ");
		else
			System.out.print("December ");
	System.out.print(year+" has " + day +" days");
	
		
	}
}
