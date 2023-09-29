package builder_pattern;

import com.fasterxml.jackson.annotation.JsonInclude;

// ConcreteBuilder
public class StudentConcreteBuilder implements StudentBuilder {

	private String id;
	private String firstName;
	private String lastName;
	private String dayOfBirth;
	private String currentClass;
	private String phone;

	@Override
	public StudentBuilder withId(String id) {
		this.id = id;
		return this;
	}

	@Override
	public StudentBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public StudentBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public StudentBuilder withDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
		return this;
	}

	@Override
	public StudentBuilder withCurrentClass(String currentClass) {
		this.currentClass = currentClass;
		return this;
	}

	@Override
	public StudentBuilder withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	@Override
	public Student build() {
		return new Student(id, firstName, lastName, dayOfBirth, currentClass, phone);
	}
}