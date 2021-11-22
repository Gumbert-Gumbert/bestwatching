package gumbert.humbert.bestwatching.repo;

import gumbert.humbert.bestwatching.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
