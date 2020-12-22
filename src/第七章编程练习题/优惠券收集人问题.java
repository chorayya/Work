package 第七章编程练习题;

public class 优惠券收集人问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] huase= {false,false,false,false};//如果花色被选到，则true，没有选到就是false
		boolean[] pai=new boolean[52];//存放52张牌,其中0-12为Spades，13-25为Clubs，26-38为Hearts，39-51为Diamonds
		String[] huases= {"Spades","Clubs","Hearts","Diamonds"};
		String[] paihao= {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		boolean flag=false;
		int count=0;//记录选牌的次数
		int ran;//0-51的随机数
		while(!flag) {
			count++;
			ran=(int)(Math.random()*52);
			int h,p;//h是花色，p是牌号
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
