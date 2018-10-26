package repository;

import model.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByFirstNameContainingIgnoreCase(String substring) {
        return null;
    }
}
