package template;

public abstract class BankTemplateMethod {
	//ConcreteMethod
	public void takeNumber()
	{
		System.out.println("取号排队");
	}
	
	public abstract void transact();
	
	public void evaluate()
	{
		System.out.println("反馈评分");
	}
	
	//模板方法！！！
	public final void process()
	{
		this.takeNumber();

		this.transact();

		this.evaluate();
	}
}
