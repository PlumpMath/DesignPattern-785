package org.factory.abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory  factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
		
		
	}

}
