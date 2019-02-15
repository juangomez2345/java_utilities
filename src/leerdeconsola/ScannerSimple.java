package leerdeconsola;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class ScannerSimple
{
	public static Scanner scanner = new Scanner(System.in);
	public static Map<String, String> registros = new LinkedHashMap<String, String>();
	
	public static void main(String[] args) 
	{
		String opcion = "";
		int iteracion = 0;
		
		do
		{
			System.out.println("-------------- " + iteracion + " --------------");
			System.out.println("Elige una opcion ");
			System.out.println("1 - Agregar Registro");
			System.out.println("2 - Eliminar Registro");
			System.out.println("3 - Mostrar Registros");
			System.out.println("0 - Salir");
			
			opcion = scanner.next().trim();
			
			if(opcion.equals("1"))
				agregaRegistro();
			if(opcion.equals("2"))
				eliminaRegistro();
			if(opcion.equals("3"))
				muestraRegistros();
			
			iteracion++;
		}
		while(!opcion.equals("0"));
	}
	
	
	public static void agregaRegistro()
	{
		System.out.println("\n\n");
		System.out.println("---- Agregar Registro ----");
		System.out.println("Escribe el nombre: ");
		
		String nombre = scanner.next();
		
		registros.put(String.valueOf(new Date().getTime()+1), nombre);
		System.out.println("\n\n");
	}
	
	public static void eliminaRegistro()
	{
		System.out.println("\n\n");
		System.out.println("---- Eliminando Registro ----");
		System.out.println("Id a eliminar: ");
		
		String id = scanner.next();
		
		if(registros.containsKey(id))
			registros.remove(id);
		System.out.println("\n\n");
	}
	
	public static void muestraRegistros()
	{
		System.out.println("\n\n");
		System.out.println("---- Mostrando Registros ----");
		
		Iterator<Entry<String, String>> i= registros.entrySet().iterator();
		
		while(i.hasNext())
		{
			Entry<String,String> e=(Entry<String,String>)i.next();
			System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
		}
		System.out.println("\n\n");
	}

}
