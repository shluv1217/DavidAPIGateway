package DavidApp.DavidAppServer.repository;

import org.springframework.data.repository.*;
import DavidApp.DavidAppServer.model.Image;

public interface ImageRepository extends PagingAndSortingRepository<Image, Long>{
	
	public Image findByName(String name);
	
}
