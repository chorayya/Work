package �ھ���;
import java.util.Date;
public class ʹ��������Date {

	public static void main(String[] args) {
		
	    Date date = new Date();
	    for(long l=10000,i=0;i<8;i++) {
		date.setTime(l);
		System.out.println(date.toString());
		l*=10;
	    }
	}

}