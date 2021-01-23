package application;

public class Model {
	
	String imageSrc,name,username;

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Model(String imageSrc, String name, String username) {
		super();
		this.imageSrc = imageSrc;
		this.name = name;
		this.username = username;
	}

}
