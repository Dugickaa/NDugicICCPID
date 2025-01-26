package be.iccbxl.pid.reservations_springboot.repository;
import java.util.List;
import java.util.Optional;


import be.iccbxl.pid.reservations_springboot.model.Type;
import org.springframework.data.repository.CrudRepository;
public interface TypeRepository extends CrudRepository<Type, Long> {
    Type findByType(String type);
    Optional<Type> findById(Long id);
}

