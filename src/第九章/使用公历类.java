package �ھ���;
import java.util.GregorianCalendar;
public class ʹ�ù����� {

	public static void main(String[] args) {
		GregorianCalendar gre=new GregorianCalendar();
		System.out.println(gre.get(gre.YEAR)+"��" + gre.get(gre.MONTH)+"��"+gre.get(gre.DAY_OF_MONTH)+"��");
	
		gre.setTimeInMillis(1234567898765L);
		System.out.println(gre.get(gre.YEAR)+"��" + gre.get(gre.MONTH)+"��"+gre.get(gre.DAY_OF_MONTH)+"��");
	}

}
