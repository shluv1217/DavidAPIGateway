package DavidApp.DavidAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import DavidApp.DavidAppServer.model.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
}
