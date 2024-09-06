package OrangeHRM_pratice.BusinesLogic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
    
   public static Properties pro;
	
	public  String ReadData(String parameterName) throws Exception
	{
		File src=new File(System.getProperty("user.dir") + "\\Properties_File\\config.properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
		String parameterValue=pro.getProperty(parameterName);
		return parameterValue;
		
	}
	
	
	public  void WriteData(String key, String value) 
	{
        pro.setProperty(key, value);
        try (FileOutputStream output = new FileOutputStream(System.getProperty("user.dir") + "\\Properties_File\\config.properties")) 
        {
            pro.store(output, "Generate values");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
