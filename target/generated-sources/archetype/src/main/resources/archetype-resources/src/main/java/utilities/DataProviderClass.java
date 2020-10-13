#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name = "filling_details")
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Form_filling");
		
		return data;
	}
	
}
