package �����±����ϰ��;
import java.util.Scanner;
public class ð������ {

	public static void main(String[] args) {
		//����ʮ����
		System.out.print("����ʮ������");
		Scanner input=new Scanner(System.in);
		double[] list=new double[9];
		for(int i=0;i<9;++i) {
			list[i]=input.nextDouble();
		}
		bubbleSort(list);
		for(int i=0;i<9;++i) {
			System.out.print(list[i] +" ");
		}
	
	}

	//ð�����򷽷�
	public static void bubbleSort(double[] list) {
		for(int i=0;i<list.length-1;++i) {
			for(int j=0;j<list.length-i-1;++j) {
				if(list[j]>list[j+1]) {//���ǰ��������ں������������λ��
					double temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
	}
}
