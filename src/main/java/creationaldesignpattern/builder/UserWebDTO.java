package creationaldesignpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class UserWebDTO implements UserDTO {

	private String name;

	private String address;

	private String age;
}
