package 第三次作业;
import java.util.Scanner;
public class 两个矩形 {
	public static void main(String[] args) {
		//提示用户输入两个矩阵中点x的坐标和y的坐标以及宽度和高度
		Scanner input=new Scanner(System.in);
		System.out.print("Enter rl's center x-, y-coordinates, width, and height: ");
		double x1,y1,w1,h1,x2,y2,w2,h2;
		x1=input.nextDouble();
		y1=input.nextDouble();
		w1=input.nextDouble();
		h1=input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		x2=input.nextDouble();
		y2=input.nextDouble();
		w2=input.nextDouble();
		h2=input.nextDouble();
		
		//判断第二个矩形是否在第一个矩形内，还是和第一个矩形重叠
		double inXMin=x1-(w1-w2)/2;
        double inXMax=x1+(w1-w2)/2;
        double inYMin=y1-(h1-h2)/2;
        double inYMax=y1+(h1-h2)/2;
        double outXMin=x1-(w1+w2)/2;
        double outXMax=x1+(w1+w2)/2;
        double outYMin=y1-(h1+h2)/2;
        double outYMax=y1+(h1+h2)/2;
        if(x2>=inXMin&&x2<=inXMax&&y2>=inYMin&&y2<=inYMax){
            System.out.println("r2 is inside rl");
        }else if(x2<=outXMin||x2>=outXMax||y2<=outYMin||y2>=outYMax){
            System.out.println("r2 overlaps rl");
        }else{
            System.out.println("r2 does not overlap rl");
        }
		
	}
}
