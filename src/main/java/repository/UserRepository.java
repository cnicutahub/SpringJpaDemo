package repository;

import model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User findByUsername(String username);

    User findByFirstNameContainingIgnoreCase(String substring);
}
