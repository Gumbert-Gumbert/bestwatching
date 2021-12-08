package gumbert.humbert.bestwatching.service;

import gumbert.humbert.bestwatching.entity.Message;
import gumbert.humbert.bestwatching.entity.User;
import gumbert.humbert.bestwatching.repo.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public List<Message> findMessageBySender(User user) {
        return messageRepository.findMessageBySender(user);
    }
}
