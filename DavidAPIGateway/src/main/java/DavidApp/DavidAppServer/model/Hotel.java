package DavidApp.DavidAppServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Hotel {
	@Id @GeneratedValue
	private Long id;
	private String name;

	public Hotel(){
    }

	public Hotel(String name){
	    this.name = name;
	}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
