package 第七章编程练习题;
import java.util.Scanner;
public class 对学生排序 {

	public static void main(String[] args) {
		String[] name=new String[100];
		double[] score=new double[100];
		Scanner input=new Scanner(System.in);
		
		//输入学生人数，姓名和成绩
		System.out.print("输入学生个数，姓名和成绩：");
		int sum=input.nextInt();
		for(int i=0;i<sum;++i) {
			name[i]=input.next();
			score[i]=input.nextDouble();			
		}
		
		//使用选择排序对学生成绩进行降序排序
		for(int i=0;i<sum-1;++i) {
			double currentMax=score[i];
			String currentMaxName=name[i];
			int currentMaxIndex=i;
			for(int j=i+1;j<sum;++j) {
				if(currentMax<score[j]) {
					currentMax=score[j];
					currentMaxName=name[j];
					currentMaxIndex=j;
				}
			}
			if(currentMaxIndex!=i) {
				score[currentMaxIndex]=score[i];
				name[currentMaxIndex]=name[i];
				score[i]=currentMax;
				name[i]=currentMaxName;
			}
		}
		
		//输出
		for(int i=0;i<sum;++i) {
			System.out.println(name[i]);
		}
	
		
		
		
		
		
		
		
	}


}
