import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class HelloWorldExample {

	/**
	 * @param args
	 */
		public static void main(String[] args)
		{
		Document document=new Document();
		try
		{
			PdfWriter.getInstance(document,new FileOutputStream("HelloWorld.pdf"));
			document.open();
			document.add(new Paragraph("A hello world pdf document"));
			document.close();
		}
		catch(DocumentException e)
		{
			e.printStackTrace();
		}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
		}

	}


	


