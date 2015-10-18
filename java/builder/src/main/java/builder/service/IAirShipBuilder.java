package builder.service;

import builder.domain.Engine;
import builder.domain.EscapeTower;
import builder.domain.OrbitalModule;

public interface IAirShipBuilder {
	Engine builderEngine();
	OrbitalModule builderOrbitalModule();
	EscapeTower  builderEscapeTower();
}
