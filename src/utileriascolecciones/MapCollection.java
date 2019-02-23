package colecciones;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class MapCollection 
{
	public static int numElements = 10;
	public static Map<String, String> myHashMap = new HashMap<String, String>();
	public static Map<String, String> myHashtable = new Hashtable<String, String>();
	public static Map<String, String> myLinkedHashMap = new LinkedHashMap<String, String>();
	public static Map<String, String> myTreeMap = new TreeMap<String, String>();
	

	public static void main(String[] args) 
	{
		addElementsToMapCollections();
		printElementsFromHashMap();
		printElementsFromHashtable();
		printElementsFromLinkedHashMap();
		printElementsFromTreeMap();
	}
	
	
	public static void addElementsToMapCollections()
	{
		for(int indice=0; indice<numElements; indice++)
		{
			myHashMap.put(String.valueOf( Math.ceil((Math.random()*1000))), String.valueOf( Math.ceil((Math.random()*1000))) );
			myHashtable.put(String.valueOf( Math.ceil((Math.random()*1000))), String.valueOf( Math.ceil((Math.random()*1000))) );
			myLinkedHashMap.put(String.valueOf( Math.ceil((Math.random()*1000))), String.valueOf( Math.ceil((Math.random()*1000))) );
			myTreeMap.put(String.valueOf( Math.ceil((Math.random()*1000))), String.valueOf( Math.ceil((Math.random()*1000))) );
		}
	}
	
	public static void printElementsFromHashMap()
	{
		for (Map.Entry<String, String> element : myHashMap.entrySet()) 
		{
		    System.out.println(element.getKey() + " , " + element.getValue());
		}
		System.out.println();
	}	
	
	public static void printElementsFromHashtable()
	{
		Set<String> myHashTableKeys = myHashtable.keySet();
		
		for (String key : myHashTableKeys) 
		{
			String value = myHashtable.get(key);
			System.out.println(key + " , " + value);
		}
		System.out.println();
	}
	
	public static void printElementsFromLinkedHashMap()
	{
		for (Map.Entry<String, String> element : myLinkedHashMap.entrySet()) 
		{
		    System.out.println(element.getKey() + " , " + element.getValue());
		}
		System.out.println();
	}
	
	public static void printElementsFromTreeMap()
	{
		for (Map.Entry<String, String> element : myTreeMap.entrySet()) 
		{
		    System.out.println(element.getKey() + " , " + element.getValue());
		}
		System.out.println();
	}	
	
}
