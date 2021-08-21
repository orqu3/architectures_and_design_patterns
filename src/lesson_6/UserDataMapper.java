package lesson_6;

import java.util.Optional;

public interface UserDataMapper {

    Optional<User> find(int id);

    void insert(User User) throws DataMapperException;

    void update(User user) throws DataMapperException;

    void delete(User user) throws DataMapperException;
}

