package creandoarchivos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;



public class FileUtility 
{
	public static String finalResultFile = "C:\\Temp\\cfSummary.txt";
	private static Map<String, String> mapFileList = new LinkedHashMap<String, String>();
	
	
	public static void init()
	{
		mapFileList.put("validated_user_audit.txt", "validated_user_audit.txt");
		mapFileList.put("Config.xml", "Config.xml");
		mapFileList.put("colinas.jpg", "colinas.jpg");
		mapFileList.put("flores.jpg", "flores.jpg");
		mapFileList.put("sol.jpg", "sol.jpg");		
	}
	
	
	public static void addDataToFile(Map<String, String> _mapTable) throws IOException
	{
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		
		try
		{
			File file = new File(finalResultFile);
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			
            java.util.Date fileDate = new java.util.Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);			
			
            bufferedWriter.write("--------------------------------------------------------------------\r\n");
			bufferedWriter.write(simpleDateFormat.format(fileDate));
			bufferedWriter.write("\r\n");
			bufferedWriter.write("--------------------------------------------------------------------\r\n");
			
	        Iterator itMapFiles = _mapTable.keySet().iterator();
	        while (itMapFiles.hasNext()) 
	        {      
	            String key = (String) itMapFiles.next();
	            bufferedWriter.write(key);
	            bufferedWriter.write("\r\n");
	        }			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		finally
		{
			bufferedWriter.close();
			fileWriter.close();
		}
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		init();
		addDataToFile(mapFileList);
		
		System.out.println("finished");
	}
}
