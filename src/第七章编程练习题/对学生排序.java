package �����±����ϰ��;
import java.util.Scanner;
public class ��ѧ������ {

	public static void main(String[] args) {
		String[] name=new String[100];
		double[] score=new double[100];
		Scanner input=new Scanner(System.in);
		
		//����ѧ�������������ͳɼ�
		System.out.print("����ѧ�������������ͳɼ���");
		int sum=input.nextInt();
		for(int i=0;i<sum;++i) {
			name[i]=input.next();
			score[i]=input.nextDouble();			
		}
		
		//ʹ��ѡ�������ѧ���ɼ����н�������
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
		
		//���
		for(int i=0;i<sum;++i) {
			System.out.println(name[i]);
		}
	
		
		
		
		
		
		
		
	}


}
