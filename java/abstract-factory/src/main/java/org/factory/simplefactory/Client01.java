package org.factory.simplefactory;

public class Client01 {

	/*
	 *  测试在没有工厂模式的情况下
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}

}
