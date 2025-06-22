package design_principles.factory_method_pattern_example;

public class WordDocumentFactory extends DocumentFactory{

	@Override
	public void createDocument() {

		System.out.println("Creating Word Document");
	}

}
