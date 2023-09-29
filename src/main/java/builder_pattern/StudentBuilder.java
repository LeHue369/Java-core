package builder_pattern;

public interface StudentBuilder {
	StudentBuilder withId(String id);

	StudentBuilder withFirstName(String firstName);

	StudentBuilder withLastName(String lastName);

	StudentBuilder withDayOfBirth(String dayOfBirth);

	StudentBuilder withCurrentClass(String currentClass);

	StudentBuilder withPhone(String phone);

	Student build();
}
