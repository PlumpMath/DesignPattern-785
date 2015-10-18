package builder.service;

import builder.domain.Engine;
import builder.domain.EscapeTower;
import builder.domain.OrbitalModule;

public class AirShipBuilderImpl implements IAirShipBuilder {
	//StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	@Override
	public Engine builderEngine() {
		// TODO Auto-generated method stub
		System.out.println("构建发动机！");
		return new Engine("发动机！");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		// TODO Auto-generated method stub
		System.out.println("构建轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("构建逃逸塔");
		return new EscapeTower("逃逸塔");
	}

}
