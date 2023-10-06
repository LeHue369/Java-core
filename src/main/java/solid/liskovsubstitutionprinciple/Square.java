package solid.liskovsubstitutionprinciple;

public class Square implements Shape{

  private int side;

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side*side;
	}
}



