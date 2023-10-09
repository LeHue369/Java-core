package solid.interfaceSegregation;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class User extends Entity {

	private String name;

	private LocalDateTime lastLogin;
}
