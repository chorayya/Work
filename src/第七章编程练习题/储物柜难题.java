package �����±����ϰ��;

public class ��������� {
	public static void main(String args[]) {
		boolean[] L=new boolean[101];//L�����Ź��ӵĿ���״�����������Ϊtrue����Ϊfalse
		for(int i=1;i<=100;++i) {
			L[i]=false;
		}
		for(int s=1;s<=100;s++) {//ѧ��
				for(int t=s;t<=100;++t) {//�ı����
					if(t % s ==0) {
						if(L[t]==false)
							L[t]=true;
						else
							L[t]=false;
					}
				}
			
		}
		for(int i=1;i<=100;++i) {
			if(L[i]==true)
				System.out.println(i);
		}
		
	}
}
