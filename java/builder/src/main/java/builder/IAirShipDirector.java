package builder;

import builder.domain.AirShip;

public interface IAirShipDirector {
	/**
	 * 组装飞船对象
	 * @return
	 */
	AirShip   directAirShip();
}
