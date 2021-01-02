package 第九章;
import java.util.Random;
public class 使用随机类Random {

	public static void main(String[] args) {
		Random random=new Random(1000);
		for(int i=0;i<50;++i) {
			System.out.print(random.nextInt(100)+" ");
		}
	}

}
