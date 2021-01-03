package 第十一章;
import java.util.Scanner;
public class 凸多边形面积 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of the points:");
		int n=input.nextInt();
		Point[] point=new Point[100];
		System.out.print("Enter the coordinates of the points:");
		for(int i=0;i<n;++i) {
			point[i].setX(input.nextDouble());
			point[i].setY(input.nextDouble());
		}
		System.out.println(point[1].getX());
		double sum=0;
		double area;
		for(int i=2;i<n;++i) {
			area=(point[i - 1].getX() * point[i].getY() - point[i].getX()* point[i - 1].getY()) 
					- (point[0].getX() * point[i].getY() - point[i].getX()* point[0].getY()) 
					+ (point[0].getX() * point[i - 1].getY() - point[i - 1].getX() * point[0].getY());
		
			sum+=(1.0/2.0)*area;
		
		}
		System.out.println("The total area is "+sum);
	}

	
}
class Point{
	public double x;
	public double y;
	Point(){
	}
	Point(double newx,double newy){
		x=newx;
		y=newy;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
}