package excelread;

import java.io.IOException;

public class ExcelRead_main {
	public static void main(String[] args) throws IOException {
		System.out.println(ExcelRead_Ex1.getstringdata(1, 0));
		System.out.println(ExcelRead_Ex1.getintegerdata(1, 1));
	}
}