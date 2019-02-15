package renombrandoarchivos;

// JFileRename


import java.io.File;
import java.util.StringTokenizer;

public class RenameFiles {

	public String fDirectorio = "D:/Archivos";
	
	public String fPrefijo = "";
	public boolean fRename = true;
	
	public String PalabraRemplazar = "";
	public String NuevaPalabra = "";


	private void FileReplace(String[] Archivos) {
		if (!PalabraRemplazar.equals("")) 
		{
			for (int i = 0; i < Archivos.length; i++) 
			{
				File Archivo = new File(fDirectorio + "/" + Archivos[i]);
				if (Archivo.isFile()) 
				{
					String fFinal = "";
					String fName = Archivos[i].substring(0, Archivos[i].indexOf("."));
					String fExtension = Archivos[i].substring(Archivos[i].indexOf("."), Archivos[i].length());

					fFinal = fFinal + fName.replace(PalabraRemplazar, NuevaPalabra);
					fFinal = fFinal + fExtension;
					Archivo.renameTo(new File(fDirectorio + "/" + fFinal));
				}
			}
		}
	}

	private void FileRename(String[] Files) {
		if (fRename) 
		{
			for (int i = 0; i < Files.length; i++) 
			{
				File file = new File(fDirectorio + "/" + Files[i]);
				if (file.isFile()) 
				{
					String fFinal = "";
					fFinal = Rename(Files[i]);
					file.renameTo(new File(fDirectorio + "/" + fFinal));
				}
			}
		}
	}
	
	private String Rename(String NombreOriginal){
		String NombreFinal="";
		String Archivo = NombreOriginal.substring(0, NombreOriginal.indexOf("."));
		String Extension = NombreOriginal.substring(NombreOriginal.indexOf("."), NombreOriginal.length());
		StringTokenizer tokens=new StringTokenizer(Archivo, " ");
		while(tokens.hasMoreTokens())
		{
			String token = tokens.nextToken();	            
	        token = token.replaceFirst(String.valueOf(token.charAt(0)), String.valueOf(token.charAt(0)).toUpperCase());
	        NombreFinal = NombreFinal + token + " ";
	    }
		NombreFinal = NombreFinal.substring(0, (NombreFinal.length()-1));
		NombreFinal = NombreFinal + Extension;		
	  return NombreFinal;
	}	
	
    private void FilePrefix(String []Files)
    {
        if(!fPrefijo.equals(""))
        {
            for(int i=0;i<Files.length;i++)
            {
                File file = new File(fDirectorio+"/"+Files[i]);
                if(file.isFile())
                {
                    String fFinal="";
                    String fName=Files[i].substring(0, Files[i].indexOf("."));
                    String fExtension=Files[i].substring(Files[i].indexOf("."), Files[i].length());

                    fFinal = fFinal + fPrefijo;
                    fFinal = fFinal + fName;
                    fFinal = fFinal + fExtension;
                    file.renameTo(new File(fDirectorio+"/"+fFinal));
                }
            }
        }
    }	

	public static void main(String arg[]) {
		try {
			String[] Files = null;
			File AllFiles = new File("D:/Archivos");
			Files = AllFiles.list();

			System.out.println(Files.length);
			
			RenameFiles renameFiles = new RenameFiles();
						
			renameFiles.PalabraRemplazar="_";
			renameFiles.NuevaPalabra=" ";
			renameFiles.FileReplace(Files);

			renameFiles.fPrefijo="IVOZI - ";
			renameFiles.FilePrefix(Files);
			
			renameFiles.fRename=true;
			renameFiles.FileRename(Files);
			
			System.out.println("done");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
