package ��������ҵ;
import java.util.Scanner;
public class �������� {
	public static void main(String[] args) {
		//��ʾ�û��������������е�x�������y�������Լ���Ⱥ͸߶�
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
		
		//�жϵڶ��������Ƿ��ڵ�һ�������ڣ����Ǻ͵�һ�������ص�
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
