package design_principles.proxy_pattern_example;

public class ProxyImage implements Image{
	
	private RealImage realImage;
	private String filename;
	
	
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(filename);
		}
		else {
			System.out.println("Using Cached Image : "+filename);
		}
		realImage.display();
	}

}
