package prototype.service;

import java.util.Date;

import prototype.domain.Student;

public class DeepClientTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Date date = new Date(12312321331L);
		Student s1 = new Student("少利",12, date);
		Student s2 = (Student)s1.clone();   //实现深复制。s2对象的birthday是一个新对象！
		
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(23432432423L);
		
		System.out.println(s1.getBirthday());
		
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}

}
