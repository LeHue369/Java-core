package creationaldesignpattern.abstractfactory.factories;

import creationaldesignpattern.abstractfactory.products.Gpu;
import creationaldesignpattern.abstractfactory.products.Monitor;

//Why not interface here?
public abstract class Company {

	public abstract Gpu createGpu();

	public abstract Monitor createMonitor();

}