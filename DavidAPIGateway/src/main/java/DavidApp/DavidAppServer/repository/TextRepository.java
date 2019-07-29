package DavidApp.DavidAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import DavidApp.DavidAppServer.model.Hotel;
import DavidApp.DavidAppServer.model.Text;


public interface TextRepository extends JpaRepository<Text, Long>{
	
}
