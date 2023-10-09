package solid.interfaceSegregation;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

//Order entity class
@Setter
@Getter
public class Order extends Entity {

	private LocalDateTime orderPlacedOn;

	private double totalValue;
}
