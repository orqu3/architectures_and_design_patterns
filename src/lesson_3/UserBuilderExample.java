package lesson_3;

public class UserBuilderExample {

    public static void main(String[] args) {

        User user1 = new User.UserBuilder("tomas89@mail.com", "password", "Tomas", "Johnson")
                .age(32)
                .phone("12345678")
                .address("address")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("alisonBean@mail.com", "password", "Alison", "Bean")
                .age(56)
                .phone("12345678")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("doeJ@mail.com", "password", "John", "Doe")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
