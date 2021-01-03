package ������;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class ѧ�� {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<Student> students = new TreeSet<Student>();
		while(true) {
			if(input.next()=="exit")
				break;
			Student student=new Student(input.nextInt(),input.next(),input.nextInt());
			students.add(student);
		}
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			Student student = (Student)it.next();
		    System.out.println(student.getId()+" "+student.getName()+" "+ student.getAge());
		  }

	}

}
class Student implements Comparable{
	private int id;//ѧ��
	private String name;//����
	private int age;//����
	
	Student(){
	}
	Student(int id,String name,int age){
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	 public int compareTo(Object o) {
	      if (!(o instanceof Student))
	        throw new RuntimeException("����Student����");
	      Student p = (Student) o;
	      if (this.age > p.age)
	        return 1;
	      if (this.age == p.age){
	        return this.name.compareTo(p.name);
	      }
	      return -1;
	 }

	
}
