import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelfileLoop {


    public static void main(String[] args) throws IOException {
        String path="Files/excelFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet("mysheet1");
        int numorrows=sheet.getPhysicalNumberOfRows(); // this gives the int number of rows which are not empty.
        for (int i = 0; i <=numorrows-1; i++) {
            XSSFRow rowdata=sheet.getRow(i);
            int celldata=rowdata.getPhysicalNumberOfCells();
            for (int j = 0; j <=celldata-1 ; j++) {
                 XSSFCell celll=rowdata.getCell(j);
                System.out.print(celll+" ");
            }
            System.out.println();
        }
    }

}
