package �ļ�����;
import java.io.*;
public class M2 {

	public static void main(String[] args) throws IOException{
		FileReader fo=new FileReader("C:\\Users\\choray\\��ҵ\\src\\�ļ�����\\input.txt");
		FileWriter fp=new FileWriter("C:\\Users\\choray\\��ҵ\\src\\�ļ�����\\output.txt");
		
		BufferedReader input=new BufferedReader(fo);
		BufferedWriter ouput=new BufferedWriter(fp);
		String tmp;
		while((tmp=input.readLine())!=null ) {
			ouput.write(tmp);
			ouput.newLine();
		}
		 input.close();
	     ouput.close();
	}

}
