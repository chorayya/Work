package 第三次作业;

public class Shuzi {
	public static void main(String[] args) {
		//生成并输出1-12的随机整数
		int number = (int)(Math.random() * 12 + 1);
		System.out.println(number);

		//输出相应的英文月份
		if (number == 1)
			System.out.println("January");
		else if (number == 2)
			System.out.println("February");
		else if (number == 3)
			System.out.println("March");
		else if (number == 4)
			System.out.println("April");
		else if (number == 5)
			System.out.println("May");
		else if (number == 6)
			System.out.println("June");
		else if (number == 7)
			System.out.println("July");
		else if (number == 8)
			System.out.println("August");
		else if (number == 9)
			System.out.println("September");
		else if (number == 10)
			System.out.println("October");
		else if (number == 11)
			System.out.println("November");
		else
			System.out.println("December");
	}
}
