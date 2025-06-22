package design_principles.proxy_pattern_example;

public class TestProxyPattern {

	public static void main(String[] args) {
		Image img1 = new ProxyImage("Test1.jpg");
		Image img2 = new ProxyImage("Test2.jpg");
		
		img1.display();//Initially Load image from server and lazy instantiation
		System.out.println();
		
		img1.display();//cached image will be loaded
		System.out.println();
		
		img2.display();//another Image loaded lazy
	}

}
