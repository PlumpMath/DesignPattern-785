package prototype.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import prototype.domain.Student;

public class ClientSerialTet {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Date date = new Date(12312321331L);
		Student s1 = new Student("少利",12, date);
		//Student s2 = (Student)s1.clone();   //实现深复制。s2对象的birthday是一个新对象！
//		使用序列化和反序列化实现深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream    oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream  bis = new ByteArrayInputStream(bytes);
		ObjectInputStream	  ois = new ObjectInputStream(bis);
		
		Student s2 = (Student) ois.readObject();   //克隆好的对象！
		
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
