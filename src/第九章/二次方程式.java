package 第九章;
import java.util.Scanner;
public class 二次方程式 {

	public static void main(String[] args) {
		System.out.print("输入三个数a，b，c：");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation qua=new QuadraticEquation(a,b,c);
		double h=qua.getDiscriminant();
		if(h<0) {
			System.out.println("The equation has no roots.");
		}
		else if(h==0) {
			System.out.println(qua.getRoot1());
		}
		else System.out.println(qua.getRoot1()+" "+qua.getRoot2());
	}

}
 class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	QuadraticEquation(){
	}
	QuadraticEquation(double newa,double newb,double newc){
		a=newa;
		b=newb;
		c=newc;
	}
	public void set(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	} 
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		double h=b*b-4*a*c;
		if(h<0) return 0;
		else {
			return ((-b+Math.pow(h, 0.5))/(2*a));
		}
	}
	
	public double getRoot2() {
		double h=b*b-4*a*c;
		if(h<0) return 0;
		else {
			return ((-b-Math.pow(h, 0.5))/(2*a));
		}
	}
	
	
	
	
	
}