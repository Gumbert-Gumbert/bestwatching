package gumbert.humbert.bestwatching.controller;

import gumbert.humbert.bestwatching.service.UserService;
import gumbert.humbert.bestwatching.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public User blabla() {
//        User user = new User();
//        user.setUsername("admin");
//        user.setActive(true);
//        user.setRole(Role.ADMIN);
//        user.setPassword("123");
//       return userService.saveUser(user);
        return null;
    }
}
