package creationaldesignpattern.factory;

public class Boss {

	public static void main(String[] args) {
		viewCar();
	}

	public static void viewCar() {
		CarFactory carFactory = new CarFactory();
		carFactory.viewCar("HONDA");
		carFactory.viewCar("NEXUS");
		carFactory.viewCar("TOYOTA");
	}

}