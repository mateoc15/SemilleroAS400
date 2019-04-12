package com.sophos.logic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Esta clase es para 
public class Excel {
	String urlFile = "C:\\Users\\SEMILLERO09\\Documents\\Busqueda.xlsx"; //Se crea una variable de tipo string para la ruta del excel
	String sheetName = "Hoja1"; //se crea una variable string para especificar el nombre de la hoja del excel
	private static Workbook myWorkbook;  //se crea una variable de tipo workbook de la libreria de poi para manejar el archivo excel
	Sheet mySheet; // se crea una variable de tipo Sheet, la cual va a contener la hoja del archivo de excel
	Row row; //se crea una variable de tipo Row para manejar las filas del archivo excel
	FileInputStream inputStream; //variable FileInputStream
	
	public Excel() {//este es el constructor de la clase, cuando se crea un objeto de la clase excel, inmediatamente
		cargarExcel(urlFile);//se realiza el metodo cargarExcel que se define mas abajo
	}
	
	public Sheet getMySheet() {  //Este metodo se crea para obtener la hoja del archivo excel
		return mySheet;
	}

	
	public Row getRow(int i) { //método para obtener la fila, pasandole como argumento el número de la fila
		return mySheet.getRow(i);
	}

	
	public void cargarExcel(String url) { //este método es el que se llama con el constructor y sirve para inicializar el archivo de excel
		File file = new File(url);//variable de tipo archivo y le pasamos como argumento la url de nuestro excel
		try {//como es una operación de input(output se debe encerrar dentro de un try/catch
			inputStream = new FileInputStream(file); //la variable inputstream recibe el archivo que se definio en el paso anterior
			myWorkbook = new XSSFWorkbook(inputStream); // ahora se crea un workbook, expecificando que va a ser un archivo de excel con XSSF
			mySheet = myWorkbook.getSheet(sheetName);//luego de crea la hoja con el nombre definido arriba en las variables
		} catch (FileNotFoundException e) {// si lo que esta dentro del try lanza un error entonces ejecuta el catch
			System.out.println("El archivo no fue encontrado"); // en caso de que no se encuentre el archivo de excel
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block// y en caso que haya una excepcion de entrada y salida
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
