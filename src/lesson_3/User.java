package lesson_3;

/*
 * 1. Реализовать как минимум один порождающий паттерн в своем домашнем приложении.
 *
 * Для примера использую класс User и паттерн Builder. У объекта User имеются 7 аттрибутов.
 * Если мы хотим создать неизменяемый класс User, мы должны передать все шесть данных в качестве параметров в
 * конструктор:
 *
 *     public User(String email, String password, String firstName, String lastName, int age, String phone, String address) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
 *
 * Если, например, только email, password, firstName, lastName являются обязательными, а остальные 3 поля - необязательными, тогда нужно
 * больше конструкторов... А в  случае если будут появляться дополнительные атрибуты, паттерн Builder поможет использовать
 * дополнительные аттрибуты, сохраняя при этом неизменность класса User.
 */

public class User {

    //All final attributes
    private final String email; // required
    private final String password; // required
    private final String firstName; //required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    public User(UserBuilder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    //All getter, and NO setter to provide immutability
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: [" + this.email + ", " + this.password + ", " + this.firstName + ", " + this.lastName + ", "
                + this.age + ", " + this.phone + ", " + this.address + "]";
    }

    public static class UserBuilder {
        private final String email;
        private final String password;
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String email, String password, String firstName, String lastName) {
            this.email = email;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        //Return the finally constructed User object
        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
