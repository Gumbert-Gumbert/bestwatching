package gumbert.humbert.bestwatching.entity;

import lombok.Data;

import javax.persistence.*;

import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "permission")
@Data
public class Permission {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "permissions")
    private Collection<Role> roles;

    Permission(String name) {
        this.name = name;
    }
}

