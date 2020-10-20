package 第三次作业;
import java.util.Scanner;
public class 某天星期几 {
	public static void main(String[] args) {
		//提示用户输入年、月和该月的哪一天
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year:(e. g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month:1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month:1-31: ");
		int day = input.nextInt();
		
		//由公式计算并输出
		int h;
		if(month==1) {
			month=13;
			year=year-1;}
		else if(month==2) {
			month=14;
			year=year-1;}
		int j=(int)year/100;
		int k=year%100;
		h=(day+(int)26*(month+1)/10+k+(int)k/4+(int)j/4+5*j)%7;
		if(h==0)
			System.out.println("Day of the week is Saturday");
		else if(h==1)
			System.out.println("Day of the week is Sunday");
		else if(h==2)
			System.out.println("Day of the week is Monday");
		else if(h==3)
			System.out.println("Day of the week is Tuesday");
		else if(h==4)
			System.out.println("Day of the week is Wednesday");
		else if(h==5)
			System.out.println("Day of the week is Thursday");
		else if(h==6)
			System.out.println("Day of the week is Friday");
	}
}
