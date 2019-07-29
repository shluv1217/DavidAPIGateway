package DavidApp.DavidAppServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Text {
	
	@Id @GeneratedValue
	private Long id;
	private String text;
	private Text(){	
	}
	
	public Text(String text){
		this.text = text;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}	
	
}
