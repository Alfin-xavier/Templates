package it.pkg.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import it.pkg.basetest.BaseTest;
import it.pkg.pagehelper.HandlingFramesUsingJS;
import it.pkg.utilities.DataProviderClass;

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
