package creationaldesignpattern.abstractfactory.factories;

import creationaldesignpattern.abstractfactory.products.AsusGpu;
import creationaldesignpattern.abstractfactory.products.AsusMonitor;
import creationaldesignpattern.abstractfactory.products.Gpu;
import creationaldesignpattern.abstractfactory.products.Monitor;

public class AsusManufacturer extends Company {

	@Override
	public Gpu createGpu() {
		return new AsusGpu();
	}

	@Override
	public Monitor createMonitor() {
		return new AsusMonitor();
	}

}