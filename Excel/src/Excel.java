import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileOutputStream;

public class Excel {
	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet1 = workbook.createSheet("First");
		Sheet sheet2 = workbook.createSheet("Second");
		Sheet sheet3 = workbook.createSheet("Third");
		try {
			FileOutputStream fos = new FileOutputStream("FirstExcelDocument1.xls");
			workbook.write(fos);
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
