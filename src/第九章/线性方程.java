package 第九章;
import java.util.Scanner;
public class 线性方程 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入a,b,c,d,e,f：");
		double a,b,c,d,e,f;
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		d=input.nextDouble();
		e=input.nextDouble();
		f=input.nextDouble();
		LinearEquation lin=new LinearEquation(a,b,c,d,e,f);
		if(lin.isSolvable())
			System.out.println(lin.getX()+" "+lin.getY());
		else
			System.out.println(" The equation has no solution.");

	}

}
class LinearEquation{
	private double a,b,c,d,e,f;

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	LinearEquation(){
		
	}
	LinearEquation(double newa,double newb,double newc,double newd,double newe,double newf){
		a=newa;
		b=newb;
		c=newc;
		d=newd;
		e=newe;
		f=newf;
	}
	
	public boolean isSolvable() {
		if((a*d-b*c)!=0) {
			return true;
		}
		else return false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
	
	
	
}
