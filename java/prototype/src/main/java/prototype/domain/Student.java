package prototype.domain;

import java.io.Serializable;
import java.util.Date;

public class Student implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sname;
	private int   age;
	private Date  birthday;
	
	public Student ()
	{
		
	}
	
	public Student(String sname, int age, Date birthday)
	{
		super();
		this.sname = sname;
		this.age = age;
		this.birthday = birthday;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Object obj = super.clone();
		
		//实现深复制功能(deep Clone)
		Student s = (Student)obj;
		//把属性也进行克隆！
		s.birthday = (Date)this.birthday.clone();
		
		return obj;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", age=" + age + ", birthday="
				+ birthday + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	
	
	
}
