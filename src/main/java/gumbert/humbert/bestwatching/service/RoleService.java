package gumbert.humbert.bestwatching.service;

import gumbert.humbert.bestwatching.entity.Role;
import gumbert.humbert.bestwatching.repo.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }
}
