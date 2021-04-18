package groovyDay1

import jxl.Sheet
import jxl.Workbook

class ExcelReadWithJXL {

	static main(args) {
		
		File myFile= new File("C:/Users/SanjayKushwaha/Desktop/attachments/xlsx_attachment_Blue.xls");
		Workbook wb = Workbook.getWorkbook(myFile);
		Sheet sh = wb.getSheet("Sheet1");
		String username=sh.getCell(0,0).getContents();
		println("username is "+username)
		username=sh.getCell(1,1).getContents();
		println("password is "+username)

		
		int rowSize=sh.getRows();
		int columnSize=sh.getColumns();
		println("total number of rows has data ="+rowSize);
		println("total number of columns has data ="+columnSize);
		for (i in 0..<rowSize) {
			for (j in 0..<columnSize) {
				String celldata=sh.getCell(j,i).getContents();
				println("value stored at $i th row and $j th column is "+celldata)
			}
		}


	}

}
