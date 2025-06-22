package design_principles.factory_method_pattern_example;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		System.out.println("--------For Word Document------");
		DocumentFactory wordDocumentFactory = new WordDocumentFactory();
		wordDocumentFactory.createDocument();
		System.out.println("--------To Open Word Document------");
		WordDocument wordDocumentType = new WordDocumentType();
		wordDocumentType.open();
		
		System.out.println("--------For PDF Document------");
		DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
		pdfDocumentFactory.createDocument();
		System.out.println("--------To Open PDF Document------");
		PdfDocument pdfDocumentType = new PdfDocumentType();
		pdfDocumentType.open();
		
		System.out.println("--------For Excel Document------");
		DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();
		excelDocumentFactory.createDocument();
		System.out.println("--------To Open Excel Document------");
		ExcelDocument excelDocumentType = new ExcelDocumentType();
		excelDocumentType.open();
	}

}
