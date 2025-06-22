package design_principles.factory_method_pattern_example;

public class PdfDocumentType extends PdfDocument{

	@Override
	public void open() {
		
		System.out.println("Opening Pdf Document");
		
	}

}
