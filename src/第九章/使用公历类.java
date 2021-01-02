package 第九章;
import java.util.GregorianCalendar;
public class 使用公历类 {

	public static void main(String[] args) {
		GregorianCalendar gre=new GregorianCalendar();
		System.out.println(gre.get(gre.YEAR)+"年" + gre.get(gre.MONTH)+"月"+gre.get(gre.DAY_OF_MONTH)+"日");
	
		gre.setTimeInMillis(1234567898765L);
		System.out.println(gre.get(gre.YEAR)+"年" + gre.get(gre.MONTH)+"月"+gre.get(gre.DAY_OF_MONTH)+"日");
	}

}
