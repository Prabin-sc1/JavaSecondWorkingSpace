import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Word {
	public static void main(String[] args) {
	XWPFDocument document =new XWPFDocument();
	
	
	try {
		FileOutputStream fos=new FileOutputStream("First.docx");
		document.write(fos);
		fos.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}