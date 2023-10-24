package creationaldesignpattern.builderpattern;

import java.time.LocalDate;

public interface UserDTOBuilder {

	UserDTOBuilder withFirstName(String firstName);

	UserDTOBuilder withLastName(String lastName);

	UserDTOBuilder withBirthday(LocalDate date);

	UserDTOBuilder withAddress(Address address);

	UserDTO build();
}
