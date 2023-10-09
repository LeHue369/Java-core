package solid.dependencyinversionprinciple;

public class Main {

	public static void main(String[] args) {
    myDrawMethod(new Triangle());
		myDrawMethod(new Circle());
	}

	public static void myDrawMethod(Shape shape){
		 shape.draw();
	}
}
