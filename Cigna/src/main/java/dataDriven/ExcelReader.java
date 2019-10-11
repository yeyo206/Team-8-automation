package dataDriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    static List<String> itemsList = null;

    public static void main(String[] args) {
        try {
            getItems();
        } catch(FileNotFoundException ex){
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public static List<String> getItems() throws FileNotFoundException, IOException{
        File file = new File("../DataManagement/Items List.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workBook = new XSSFWorkbook(fis);
        XSSFSheet items = workBook.getSheet("Items");

        Iterator<Row> itr = items.iterator();
        itemsList = new ArrayList<>();

        while(itr.hasNext()){
            Row row = itr.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while(cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                itemsList.add(cell.getStringCellValue());
            }
        }
        return itemsList;
    }

}
