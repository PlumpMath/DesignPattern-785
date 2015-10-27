package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{Star.class}, handler);
		
		proxy.sing();
	}

}
