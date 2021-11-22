package gumbert.humbert.bestwatching;

import gumbert.humbert.bestwatching.entity.Permission;
import gumbert.humbert.bestwatching.entity.Role;
import gumbert.humbert.bestwatching.entity.User;
import gumbert.humbert.bestwatching.service.PermissionService;
import gumbert.humbert.bestwatching.service.RoleService;
import gumbert.humbert.bestwatching.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Set;

@SpringBootApplication
public class BestwatchingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BestwatchingApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService, RoleService roleService, PermissionService permissionService,
                          PasswordEncoder passwordEncoder) {
        return args -> {
            Permission write = new Permission("write");
            Permission read = new Permission("read");
            permissionService.savePermission(write);
            permissionService.savePermission(read);
            Set<Permission> permissionsAdmin = Set.of(write, read);
            Set<Permission> permissionsClient = Set.of(read);
            Role role_admin = roleService.saveRole(new Role("ROLE_ADMIN", permissionsAdmin));
            roleService.saveRole(new Role("ROLE_CLIENT", permissionsClient));
            User user = new User();
            user.setPassword(passwordEncoder.encode("123"));
            user.setUsername("admin");
            user.setActive(true);
            user.setRoles(Set.of(role_admin));
            userService.saveUser(user);
        };

    }
}
