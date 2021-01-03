package 集合类;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class 图书 {

	public static void main(String[] args) {
		Books book1=new Books(001,"书本1",20.0,"出版社1");
		Books book2=new Books(002,"书本2",21.0,"出版社2");
		Books book3=new Books(003,"书本3",23.0,"出版社3");
		Books book4=new Books(004,"书本4",24.0,"出版社4");
	
		Map<String,Books> books=new HashMap<String,Books>();
		books.put("001", book1);
		books.put("002", book2);
		books.put("003", book3);
		books.put("004", book4);
		Iterator iter = books.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry=(Map.Entry)iter.next();
			System.out.println(entry.getKey()+" "+((Books)entry.getValue()).getName()+" "
					+((Books)entry.getValue()).getPrice()+" "+((Books)entry.getValue()).getPress());
		}
	
		
	}

}
class Books{
	private int num;// 编号
	private String name;// 名称
	private double price;// 价格
	private String press;// 出版社
	
	public Books() {
		
	}
	Books(int num,String name,double price,String press){
		this.num=num;
		this.name=name;
		this.price=price;
		this.press=press;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getPress() {
		return press;
	}

}
