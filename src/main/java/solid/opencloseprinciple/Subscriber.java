package solid.opencloseprinciple;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Subscriber {
	//base class: close for modification

	protected Long subscriberId;

	protected String address;

	protected Long phoneNumber;

	protected int baseRate;

	protected long freeUsage;

	public abstract double calculateBill();
}
