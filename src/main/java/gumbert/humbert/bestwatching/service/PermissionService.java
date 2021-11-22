package gumbert.humbert.bestwatching.service;

import gumbert.humbert.bestwatching.entity.Permission;
import gumbert.humbert.bestwatching.repo.PermissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class PermissionService {
    private final PermissionRepository permissionRepository;

    public Permission savePermission(Permission permission) {
        return permissionRepository.save(permission);
    }
}
