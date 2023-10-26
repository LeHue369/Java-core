package creationaldesignpattern.abstractfactory.factories;

import creationaldesignpattern.abstractfactory.products.Gpu;
import creationaldesignpattern.abstractfactory.products.Monitor;
import creationaldesignpattern.abstractfactory.products.MsiGpu;
import creationaldesignpattern.abstractfactory.products.MsiMonitor;

public class MsiManufacturer extends Company {

	@Override
	public Gpu createGpu() {
		return new MsiGpu();
	}

	@Override
	public Monitor createMonitor() {
		return new MsiMonitor();
	}

}