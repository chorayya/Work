package ��������ҵ;
import java.util.Scanner;
public class ĳ�����ڼ� {
	public static void main(String[] args) {
		//��ʾ�û������ꡢ�º͸��µ���һ��
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year:(e. g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month:1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month:1-31: ");
		int day = input.nextInt();
		
		//�ɹ�ʽ���㲢���
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
