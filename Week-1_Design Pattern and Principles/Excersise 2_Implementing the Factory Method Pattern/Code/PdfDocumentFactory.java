package design_principles.factory_method_pattern_example;

public class PdfDocumentFactory extends DocumentFactory{

	@Override
	public void createDocument() {
		System.out.println("Creating PDF Document");
	}

}
