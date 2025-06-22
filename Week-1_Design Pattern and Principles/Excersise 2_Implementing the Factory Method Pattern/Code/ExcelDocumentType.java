package design_principles.factory_method_pattern_example;

public class ExcelDocumentType extends ExcelDocument{

	@Override
	public void open() {
		System.out.println("Opening Excel Document");		
	}

}
