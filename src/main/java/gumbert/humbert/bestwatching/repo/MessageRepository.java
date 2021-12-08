package gumbert.humbert.bestwatching.repo;

import gumbert.humbert.bestwatching.entity.Message;
import gumbert.humbert.bestwatching.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findMessageBySender(User user);
}
