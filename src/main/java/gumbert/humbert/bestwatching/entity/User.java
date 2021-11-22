package gumbert.humbert.bestwatching.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class User {
    private String username;
    private String password;
    private boolean isActive;
    private Role role;
}
