package gumbert.humbert.bestwatching.controller;

import gumbert.humbert.bestwatching.entity.Message;
import gumbert.humbert.bestwatching.service.MessageService;
import gumbert.humbert.bestwatching.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller()
@RequestMapping("main")
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;
    private final MessageService messageService;

    @GetMapping()
    public String getMainPage() {
        return "main";
    }

    @GetMapping("mail")
    public String getAllMessage(Principal principal, Model model) {
        List<Message> messageBySender = messageService.findMessageBySender(userService.loadUserByUsername(principal.getName()));
        model.addAttribute("messages", messageBySender);
        return "mail";
    }

}
