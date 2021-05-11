package demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestNGEg {
	
	@Test(priority = 5 , groups = {"smoke" , "regression"})
	@Parameters("par")
	private void parameterTest(String par) {
		System.out.println("Parameter test : "+par);

	}
	
	@DataProvider(name="testPar")
	public static Object[][] testdatas(){
		return new Object[][] {{1,"Test"},{2, "Value"}};
	}

	@Test(dataProvider = "testPar", priority = 6 , groups = {"smoke"})
	public void dataproviderTest(int index , String value) {
		System.out.println("Index value : "+index+ " Value : "+value);
	}
	
	@DataProvider(name="exceltestPar")
	public static Object[][] excel_testdatas() throws IOException{
		return ExcelDataProvider.dataExcelReader("DummySheet");
	}

	@Test(dataProvider = "exceltestPar" , priority = 1 , groups = {"regression" , "sanity"})
	public void exceldataproviderTest(String username , String password) {
		System.out.println("UserName : "+username+ " Password : "+password);
	}
	
	
}
