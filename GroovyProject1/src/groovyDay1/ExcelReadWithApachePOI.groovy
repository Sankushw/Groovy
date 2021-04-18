package groovyDay1

import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ExcelReadWithApachePOI {

	static main(args) {

		File fs= new File("C:/Users/SanjayKushwaha/Desktop/attachments/xlsx_attachment_Blue.xlsx");
		FileInputStream fis= new FileInputStream(fs);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String celldata=sheet.getRow(0).getCell(0).getStringCellValue();
		println("value stored is "+celldata);
		int rowSize=sheet.getLastRowNum()
		println("total number of rows has data ="+rowSize);
		for (i in 0..<rowSize) {
			int columnSize=sheet.getRow(i).getLastCellNum();
			println("total number of columns has data ="+columnSize);
			for (j in 0..<columnSize) {
				celldata=sheet.getRow(i).getCell(j).getStringCellValue();
				println("value stored at $i th row and $j th column is "+celldata)

			}}
	}

}
