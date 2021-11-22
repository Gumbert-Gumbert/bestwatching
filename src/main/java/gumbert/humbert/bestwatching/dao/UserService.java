package gumbert.humbert.bestwatching.dao;

import gumbert.humbert.bestwatching.entity.User;
import gumbert.humbert.bestwatching.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.getById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
