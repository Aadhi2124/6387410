package design_principles.proxy_pattern_example;

public class RealImage implements Image {
	
	private String filename;
	
	public RealImage(String filename) {
		this.filename = filename;
		loadFromServer();
	}
	
	private void loadFromServer() {
		System.out.println("Image Loaded from Server : "+filename);
	}

	@Override
	public void display() {
		System.out.println("Displaying Image : "+filename);
	}

}
