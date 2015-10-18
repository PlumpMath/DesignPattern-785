package org.factory.simplefactory;

/*
 * 简单工厂情况下
 */
public class Client02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 =CarFactory.createCar("奥迪");
		Car c2 = CarFactory.createCar("比亚迪");
		
		c1.run();
		c2.run();
	}

}
