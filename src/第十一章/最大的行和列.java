package 第十一章;
import java.util.ArrayList;
import java.util.Scanner;
public class 最大的行和列 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> column= new ArrayList<>();
		ArrayList<Integer> row= new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the array size n:");
		int n=input.nextInt();
		System.out.println("The random array is");
		for(int i=0;i<n*n;++i) {
			list.add((int)(Math.random()*2));
			System.out.print(list.get(i));
			if(i%n==n-1) System.out.println();
		}
		int largest_row=0;
		int nrow=0;
		int largest_column=0;
		int ncolumn=0;
		for(int i=0;i<n;++i) {//第0行1的个数
			if(list.get(i)==1) {
				largest_row++;
			}
		}
		row.add(0);
		for(int i=0;i<n*n;i=i+n) {//第0列1的个数
			if(list.get(i)==1) {
				largest_column++;
			}
		}
		column.add(0);
		//计算最多1的行的下标
		for(int i=1;i<n;++i) {
			for(int j=0;j<n;++j) {
				if(list.get(i*n+j)==1) {
					nrow++;
				}
			}	
			if(nrow>largest_row) {
				row.clear();
				row.add(i);
				largest_row=nrow;
				}
			else if(nrow==largest_row)
				row.add(i);
			nrow=0;
		}
		
		System.out.print("The largest row index:");
		for(int i=0;i<row.size();++i) {
			System.out.print(row.get(i));
			if(i!=row.size()-1)
				System.out.print(",");
		}
		System.out.println();
		//计算最多1的列的下标
		for(int i=1;i<n;++i) {
			for(int j=i;j<n*n;j=j+n) {
				if(list.get(j)==1) {
					ncolumn++;
				}
			}	
			if(ncolumn>largest_column) {
				column.clear();
				column.add(i);
				largest_column=ncolumn;
				}
			else if(ncolumn==largest_column)
				column.add(i);
			ncolumn=0;
		}
		
		System.out.print("The largest column index:");
		for(int i=0;i<column.size();++i) {
			System.out.print(column.get(i));
			if(i!=column.size()-1)
				System.out.print(",");
		}		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	


}