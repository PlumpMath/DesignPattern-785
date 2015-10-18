package org.factory.factorymethod;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		
		c1.run();
		c2.run();
	}

}
