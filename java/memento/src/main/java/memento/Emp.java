package memento;

public class Emp {
	private String ename;
	private int age;
	private double salary;

	//进行备忘操作，并发挥备忘录对象
	public EmpMemento memento()
	{
		return new EmpMemento(this);
	}
	
	//恢复操作,恢复成备忘录对象的值
	public void recovery(EmpMemento memento)
	{
		this.ename = memento.getEname();
		this.age = memento.getAge();
		this.salary = memento.getSalary();
	}
	
	public Emp(String ename, int age, double salary) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
