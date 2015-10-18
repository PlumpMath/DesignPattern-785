package builder;

import builder.domain.AirShip;
import builder.service.AirShipBuilderImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAirShipDirector director = new AirshipDirectorImpl(new AirShipBuilderImpl());

		AirShip ship = director.directAirShip();
		
		System.out.println(ship.getEngine().getName());
		
		ship.launch();
	}

}
