import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder dtoBuilder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(dtoBuilder, user);
        System.out.println(dto);

        /* EXAMPLE OUTPUT
        UserWebDTO{name='Ron Swanson',
        address='Address{houseNumber='100',
                 street='State Street',
                 city='Pawnee',
                 zipcode='47998',
                 state='Indiana'}',
        age='64'}
        */
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        return builder.withFirstName(user.getFirstName()).
                withLastName(user.getLastName()).
                withBirthday(user.getBirthday()).
                withAddress(user.getAddress()).build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
