package be.iccbxl.pid.reservations_springboot.repository;
import java.util.List;


import be.iccbxl.pid.reservations_springboot.model.Locality;
import org.springframework.data.repository.CrudRepository;

public interface LocalityRepository extends CrudRepository<Locality, Long> {
    Locality findByPostalCode(String postalCode);
    Locality findByLocality(String locality);
}

