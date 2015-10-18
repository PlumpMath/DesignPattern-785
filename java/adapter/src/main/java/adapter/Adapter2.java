package adapter;

/**
 * 适配器 (对象适配器方式,使用了组合的方式跟被适配对象整合)
 * (相当于usb和ps/2的转接器)
 * @author Administrator
 *
 */
public class Adapter2 implements ITarget {

	private Adaptee adaptee;
	
	@Override
	public void handleReq() {
		// TODO Auto-generated method stub
		adaptee.request();
	}
	
	public Adapter2(Adaptee adaptee)
	{
		super();
		this.adaptee = adaptee;
	}

}
