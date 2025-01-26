package be.iccbxl.pid.reservations_springboot.repository;
import java.util.List;


import be.iccbxl.pid.reservations_springboot.model.Artist;
import org.springframework.data.repository.CrudRepository;



public interface ArtistRepository extends CrudRepository<Artist, Long> {

    List<Artist> findByLastname(String lastname);



    Artist findById(long id);

}

