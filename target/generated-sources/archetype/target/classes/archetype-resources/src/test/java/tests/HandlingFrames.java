#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import ${package}.basetest.BaseTest;
import ${package}.pagehelper.HandlingFramesUsingJS;
import ${package}.utilities.DataProviderClass;

public class HandlingFrames extends BaseTest
{

	@Test(dataProvider = "filling_details", dataProviderClass= DataProviderClass.class)
	public void handlingFrames(String name, String number, String mail)
	{
	
		HandlingFramesUsingJS frames = new HandlingFramesUsingJS(driver);
		
		try
		{
			frames.handlingFrameAndClickChatIconTest(name, number, mail);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
