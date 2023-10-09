package solid.liskovsubstitutionprinciple;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Shape{

//	public Square(int side) {
//		super(side, side);
//	}

  private int side;

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side*side;
	}
}



