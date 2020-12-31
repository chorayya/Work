package 第七章编程练习题;
import java.util.Scanner;
import java.util.Arrays;
public class 对字符串中的字符排序 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个字符串：");
		String s=input.next();

		System.out.print(sort(s));
	}
	public static String sort(String s) {
		int len=s.length();
		char[] c=new char[len];
		// 将字符串转成字符数组
		for(int i=0;i<len;++i) {
			c[i]=s.charAt(i);
		}
		Arrays.sort(c);
		String s1="";
		for(int i=0;i<len;++i) {
			s1+=c[i];
		}
		return s1;	
		}
}
