
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class Excel {
	String urlFile = "C:\\Users\\SEMILLERO09\\Documents\\Busqueda.xlsx";
	String sheetName = "Hoja1";
	private static Workbook myWorkbook;
	Sheet mySheet;
	Row row;
	FileInputStream inputStream;
	
	public Row getRow(int i) {
		return mySheet.getRow(i);
	}



	public Excel() {
		cargarExcel(urlFile);
	}
	
	
	
	
	
	public void cargarExcel(String url) {
		File file = new File(url);
		try {
			inputStream = new FileInputStream(file);
			myWorkbook = new XSSFWorkbook(inputStream);
			mySheet = myWorkbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no fue encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getRowsNumber() {
		return mySheet.getLastRowNum()-mySheet.getFirstRowNum();
	}
	
	public void closeInputSt() {
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeExcel() {
		FileOutputStream outputStream;
		try {
			outputStream = new FileOutputStream(urlFile);
			myWorkbook.write(outputStream);
		    outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
