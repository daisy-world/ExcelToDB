package com.salesxl;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcelReadService {

	@Autowired
	SaveCurrencyDataToDb repo;
	public List<CurrencyExchange> ReadDataFromExcel(String excelPath) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		Workbook workbook = WorkbookFactory.create(new File(excelPath));
		// Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        System.out.println("Retrieving Sheets using for-each loop");
        for(Sheet sheet: workbook) {
            System.out.println("=> " + sheet.getSheetName());
            
            DataFormatter dataFormatter = new DataFormatter();
            for (Row row: sheet) {
            	
    			
            	
            	Date date = row.getCell(0).getDateCellValue();
            	String base = row.getCell(1).getStringCellValue();
            	double bdt =  row.getCell(2).getNumericCellValue();
            	double eur =  row.getCell(3).getNumericCellValue();
            	double gbp =  row.getCell(4).getNumericCellValue();
            	double inr =  row.getCell(5).getNumericCellValue();
            	double aud =  row.getCell(6).getNumericCellValue();
            	double cad =  row.getCell(7).getNumericCellValue();
            	double sgd =  row.getCell(8).getNumericCellValue();
            	double usd =  row.getCell(9).getNumericCellValue();
            	
            	  
            	CurrencyExchange cr = new CurrencyExchange();
            	cr.setBase(base);
            	cr.setRecord_date(date);
            	cr.setUSD(usd);
            	cr.setEUR(eur);
            	cr.setGBP(gbp);
            	cr.setINR(inr);
            	cr.setAUD(aud);
            	cr.setCAD(cad);
            	cr.setBDT(bdt);
            	cr.setSGD(sgd);
            	
            	repo.save(cr);
            	
                System.out.println(row.getCell(0).getDateCellValue());
                System.out.println(row.getCell(1));
                System.out.println(row.getCell(2));
                System.out.println(row.getCell(3));
                System.out.println(row.getCell(4));
                System.out.println(row.getCell(5));
              
            }
            
        }
		
        
        
		return null;
	}
}
