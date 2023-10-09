package solid.dependencyinversionprinciple;

import lombok.NoArgsConstructor;

public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing Circle");
	}
}
