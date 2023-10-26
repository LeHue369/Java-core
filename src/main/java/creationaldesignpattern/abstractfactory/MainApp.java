package creationaldesignpattern.abstractfactory;

import creationaldesignpattern.abstractfactory.factories.AsusManufacturer;
import creationaldesignpattern.abstractfactory.factories.Company;
import creationaldesignpattern.abstractfactory.factories.MsiManufacturer;
import creationaldesignpattern.abstractfactory.products.Product;

import java.util.List;

public class MainApp {

	/*
	 * Video Reference: https://youtu.be/QNpwWkdFvgQ
	 */
	public static void main(String[] args) {

		Company msi = new MsiManufacturer();
		Company asus = new AsusManufacturer();

		List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
			.forEach(Product::assemble);
	}
}