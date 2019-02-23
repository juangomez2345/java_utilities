package colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetCollection 
{
	public static int numElements = 10;
	public static Set<String> myHashSet = new HashSet<String>();
	public static Set<String> myLinkedHashSet = new LinkedHashSet<String>();
	public static Set<String> myTreeSet = new TreeSet<String>();
	

	public static void main(String[] args) 
	{
		addElementsToSetCollections();
		printElementsFromHashSet();
		printElementsFromLinkedHashSet();
		printElementsFromTreeSet();
	}
	
	
	public static void addElementsToSetCollections()
	{
		for(int indice=0; indice<numElements; indice++)
		{
			myHashSet.add(String.valueOf( Math.ceil((Math.random()*1000))));
			myLinkedHashSet.add(String.valueOf( Math.ceil((Math.random()*1000))));
			myTreeSet.add(String.valueOf( Math.ceil((Math.random()*1000))));
		}
	}
	
	public static void printElementsFromHashSet()
	{
		for(String element: myHashSet)
		{
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void printElementsFromLinkedHashSet()
	{
		for(String element: myLinkedHashSet)
		{
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void printElementsFromTreeSet()
	{
		for(String element: myTreeSet)
		{
			System.out.println(element);
		}
		System.out.println();
	}	
	
}
