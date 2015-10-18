package builder;

import builder.domain.AirShip;
import builder.domain.Engine;
import builder.domain.EscapeTower;
import builder.domain.OrbitalModule;
import builder.service.IAirShipBuilder;

public class AirshipDirectorImpl implements IAirShipDirector {
	private IAirShipBuilder builder;
	
	public AirshipDirectorImpl(IAirShipBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public AirShip directAirShip() {
		// TODO Auto-generated method stub
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//装配成飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}

}
