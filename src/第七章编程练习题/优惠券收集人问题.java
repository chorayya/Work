package �����±����ϰ��;

public class �Ż�ȯ�ռ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] huase= {false,false,false,false};//�����ɫ��ѡ������true��û��ѡ������false
		boolean[] pai=new boolean[52];//���52����,����0-12ΪSpades��13-25ΪClubs��26-38ΪHearts��39-51ΪDiamonds
		String[] huases= {"Spades","Clubs","Hearts","Diamonds"};
		String[] paihao= {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		boolean flag=false;
		int count=0;//��¼ѡ�ƵĴ���
		int ran;//0-51�������
		while(!flag) {
			count++;
			ran=(int)(Math.random()*52);
			int h,p;//h�ǻ�ɫ��p���ƺ�
			h=(int)ran/13;
			p=ran%13;
			if(huase[h]==false) {
				huase[h]=true;
				System.out.println(paihao[p]+" of "+huases[h]);
			}
			if(huase[0] && huase[1] &&huase[2] && huase[3]) {
				flag=true;
			}
		}
		System.out.println("Number of picks: "+count);
	}

}
