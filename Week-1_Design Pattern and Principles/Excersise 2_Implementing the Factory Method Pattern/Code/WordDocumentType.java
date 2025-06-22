package design_principles.factory_method_pattern_example;

public class WordDocumentType extends WordDocument {

	@Override
	public void open() {
		System.out.println("Opening Word Document");
	}
}
