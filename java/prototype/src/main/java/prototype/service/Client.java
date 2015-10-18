package prototype.service;

import java.util.Date;

import prototype.domain.Student;

//测试原型模式(浅克隆)
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Date date = new Date();
		Student s1 = new Student("zzh", 12, date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(23432432423L);
		System.out.println(s1.getBirthday());
		Student s2 = (Student)s1.clone();
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}

}
