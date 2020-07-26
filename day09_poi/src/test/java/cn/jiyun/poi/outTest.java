package cn.jiyun.poi;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class outTest {

	@Test
	
	public void out() throws Exception{

		//1.实例化工作簿
		XSSFWorkbook workbook = new XSSFWorkbook();
		//2.创建sheet页
		XSSFSheet sheet = workbook.createSheet("学生信息");
		//3.创建行row
		XSSFRow row0 = sheet.createRow(0);
		//4.创建单元格并赋值
		String [] title={"编号","姓名","性别","爱好","班级"};
		for (int i = 0; i < title.length; i++) {
			XSSFCell cell = row0.createCell(i);
			cell.setCellValue(title[i]);
		}
	
		//5.导出
		FileOutputStream outputStream = new FileOutputStream("D:/学生信息.xlsx");
		workbook.write(outputStream);
	
	}
	
	
}
