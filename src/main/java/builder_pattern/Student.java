package builder_pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@ToString
@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private String dayOfBirth;
	private String currentClass;
	private String phone;
}
