package �����±����ϰ��;
import java.util.Scanner;
import java.util.Arrays;
public class ���ַ����е��ַ����� {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("����һ���ַ�����");
		String s=input.next();

		System.out.print(sort(s));
	}
	public static String sort(String s) {
		int len=s.length();
		char[] c=new char[len];
		// ���ַ���ת���ַ�����
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
