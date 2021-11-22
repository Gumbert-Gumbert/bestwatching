package gumbert.humbert.bestwatching.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "permission")
@Data
@NoArgsConstructor
public class Permission {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "permissions", fetch = FetchType.EAGER)
    private Collection<Role> roles;

    public Permission(String name) {
        this.name = name;
    }
}

