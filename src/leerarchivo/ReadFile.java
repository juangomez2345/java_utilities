package leerarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile 
{
	
	public void run()
	{
		leerArchivo();
	}
	
	
	private void leerArchivo()
	{
		String nombreArchivo = "C:\\Temp\\file_codes.txt";
		File file = new File(nombreArchivo);
		
		try
		{			
			if(file.exists())
			{
				FileReader fileReader = new FileReader(nombreArchivo);
				BufferedReader bufferReader = new BufferedReader(fileReader);
				
				String linea = "";
				
				while((linea = bufferReader.readLine())!=null)
				{
					System.out.println(linea);
				}
				
				bufferReader.close();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		new ReadFile().run();
	}
}
