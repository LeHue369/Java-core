package solid.dependencyinversionprinciple;

import lombok.NoArgsConstructor;

public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("drawing Triangle");
	}
}
