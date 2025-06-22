package design_principles.builder_pattern;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Computer c = new Computer.Builder().setCpu("Intel").setRam(8).setStorage(512).build();
		c.display();
	}

}
