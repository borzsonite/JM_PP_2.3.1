package edu.segeyrozhkov.crud.app.repository;

import edu.segeyrozhkov.crud.app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
