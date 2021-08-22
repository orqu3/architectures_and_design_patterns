package lesson_6;

import java.util.Optional;

public class Client {

    public static void main(String[] args) {

        final UserDataMapper mapper = new UserDataMapperImpl();

        User user = new User(1, "first@mail.com", "password", "Adam", "Smith");
        mapper.insert(user);
        final Optional<User> userToBeFound = mapper.find(user.getId());

        System.out.println("Found User: " + userToBeFound);

        user = new User(user.getId(), "updated@mail.com", "newPassword", "John", "Doe");
        mapper.update(user);

        System.out.println("Updated User: " + user);

        mapper.delete(user);
    }
}
