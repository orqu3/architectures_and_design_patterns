package lesson_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDataMapperImpl implements UserDataMapper {

    /*Normally this would be in the form of an actual database.*/
    private final List<User> users = new ArrayList<>();

    @Override
    public Optional<User> find(int id) {
        for (final User user : this.getUsers()) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public void insert(User user) throws DataMapperException {
        if (!this.getUsers().contains(user)) {
            this.getUsers().add(user);
        } else {
            throw new DataMapperException("User [" + user.getEmail() + "] already exists");
        }
    }

    @Override
    public void update(User user) throws DataMapperException {
        if (this.getUsers().contains(user)) {
            final int index = this.getUsers().indexOf(user);
            this.getUsers().set(index, user);
        } else {
            throw new DataMapperException("User [" + user.getEmail() + "] is not found");
        }
    }

    @Override
    public void delete(User user) throws DataMapperException {
        if (this.getUsers().contains(user)) {
            this.getUsers().remove(user);
        } else {
            throw new DataMapperException("User [" + user.getEmail() + "] is not found");
        }
    }

    public List<User> getUsers() {
        return this.users;
    }
}
