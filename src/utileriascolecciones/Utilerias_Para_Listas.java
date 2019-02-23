package algoritmos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Utilerias_Para_Listas 
{
	public static Integer[] intArray = {5,7,2,4,4,1,9,0};
	
	public static void ordena()
	{
		try
		{
			List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(intArray));
			Collections.sort(integerList);
			System.out.println(integerList);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void busca()
	{
		try
		{
			System.out.println( Arrays.asList(intArray).contains(5) );
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}				
	}	
	
	public static void repetido()
	{
		try
		{
			List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(intArray));
			Set<Integer> unique = new HashSet<Integer>(integerList); //elimina los duplicados
			for (Integer key : unique) {
			    System.out.println(key + ": " + Collections.frequency(integerList, key));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	
	
	public static void main(String[] args) 
	{
		System.out.print("ORDENA: "); ordena();
		System.out.print("BUSCA: "); busca();
		System.out.println("REPETIDO: "); repetido();
	}
}
