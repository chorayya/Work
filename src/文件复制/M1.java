package �ļ�����;
import java.io.*;
import java.util.Scanner;
public class M1 {

	public static void main(String[] args) throws IOException {
		File fo=new File("C:\\Users\\choray\\��ҵ\\src\\�ļ�����\\input.txt");
		File fp=new File("C:\\Users\\choray\\��ҵ\\src\\�ļ�����\\output.txt");
		Scanner input=new Scanner(fo);
		PrintWriter output=new PrintWriter(fp);
		while(input.hasNextLine()) {
			output.println(input.nextLine());
		}
		input.close();
		output.close();

	}

}
