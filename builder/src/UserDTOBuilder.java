import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    // method to "assemble" final product
    UserDTO build();
    // method to fetch already built object ( it is a optional)
    UserDTO getUserDTO();
}
