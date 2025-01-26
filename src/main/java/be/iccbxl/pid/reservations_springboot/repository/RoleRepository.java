package be.iccbxl.pid.reservations_springboot.repository;
import java.util.List;


import be.iccbxl.pid.reservations_springboot.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}

