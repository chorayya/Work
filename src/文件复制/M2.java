package 文件复制;
import java.io.*;
public class M2 {

	public static void main(String[] args) throws IOException{
		FileReader fo=new FileReader("C:\\Users\\choray\\作业\\src\\文件复制\\input.txt");
		FileWriter fp=new FileWriter("C:\\Users\\choray\\作业\\src\\文件复制\\output.txt");
		
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
