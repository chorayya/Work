package 第七章编程练习题;

public class 储物柜难题 {
	public static void main(String args[]) {
		boolean[] L=new boolean[101];//L数组存放柜子的开关状况，如果开，为true，关为false
		for(int i=1;i<=100;++i) {
			L[i]=false;
		}
		for(int s=1;s<=100;s++) {//学生
				for(int t=s;t<=100;++t) {//改变柜子
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
