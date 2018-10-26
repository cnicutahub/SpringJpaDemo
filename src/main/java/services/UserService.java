package services;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.UserRepository;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Transactional
//    public void add(User user) {
//        userRepository.save(user);
//    }
//
//    @Transactional
//    public User findOne(Long id) {
//        return userRepository.getOne(id);
//    }

    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }

//    @Transactional
//    public void addAll(Collection<User> products) {
//        for (User user : products) {
//            userRepository.save(user);
//        }
//    }

    @Transactional(readOnly = true)
    public User findByUsername(String name) {
        return userRepository.findByUsername(name);
    }

    @Transactional(readOnly = true)
    public User findByFirstNameContainingIgnoreCase(String searchString) {
        return userRepository.findByFirstNameContainingIgnoreCase(searchString);
    }
}
