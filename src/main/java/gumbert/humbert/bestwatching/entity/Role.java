package gumbert.humbert.bestwatching.entity;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;

import static gumbert.humbert.bestwatching.entity.Permission.READ;
import static gumbert.humbert.bestwatching.entity.Permission.WRITE;
import static java.util.stream.Collectors.toSet;

public enum Role {
    CLIENT(Set.of(READ)),
    ADMIN(Set.of(WRITE));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
