package gumbert.humbert.bestwatching.repo;

import gumbert.humbert.bestwatching.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
