package 第十一章;
import java.util.ArrayList;
import java.util.Scanner;
public class 去掉重复元素 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<>();
		System.out.print("Enter ten integers:");
		for(int i=0;i<10;++i) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);
		System.out.print("The distinct integers are ");
		for(int i=0;i<list.size();++i) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> li= new ArrayList<>();
		for(int i=0;i<10;++i) {
			if(li.contains(list.get(i))==false) {
				li.add(list.get(i));
			}
		}
		list.clear();
		for(int i=0;i<li.size();++i) {
			list.add(li.get(i));
		}
	}
}
