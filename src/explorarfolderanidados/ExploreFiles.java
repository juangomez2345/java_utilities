package explorarfolderanidados;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class ExploreFiles 
{
	
	public String path = "C:\\Temp";
	
	public ExploreFiles(){
		explore(path);
		//writeInFile(list);
	}
	
	private void explore(String path)
	{
		try
		{
			File files01 = new File(path);
			List<String> fileList = new ArrayList<String>();
			List<String> folderList = new ArrayList<String>();
			
			System.out.println(path);
			
			for(int index01=0; index01<files01.list().length; index01++)
			{
				String currentPath = path + "\\" + files01.list()[index01];
				File file02 = new File(currentPath);
				
				if(file02.isFile())
				{
					fileList.add(file02.getName());
					System.out.println("   " + file02.getName());
				}
				if(file02.isDirectory())
				{
					folderList.add(currentPath);
				}
			}
			
			for(String currentFolder: folderList)
			{
				explore(currentFolder);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void writeInFile(List<String> list)
	{
		try
		{
			FileWriter fileWriter = new FileWriter("C:\\Temp\\ExploreFilesResult.txt");
	        PrintWriter printWriter = new PrintWriter(fileWriter);
	         
	        for (String arg: list)
	        {
	        	printWriter.println(arg);
	        }
	        
	        printWriter.flush();
	        printWriter.close();
	        fileWriter.flush();
	        fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		new ExploreFiles();
		System.out.println("done");
	}
}
