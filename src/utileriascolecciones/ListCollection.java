package colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollection 
{
	public static int numElements = 10;
	public static List<String> myVector = new Vector<String>();
	public static List<String> myList = new ArrayList<String>();
	public static List<String> myLinkedList = new LinkedList<String>();
	

	public static void main(String[] args) 
	{
		addElementsToListCollections();
		
		printElementsFromVector();
		printElementsFromList();
		printElementsFromLinkedList();		
	}
	
	
	public static void addElementsToListCollections()
	{
		for(int indice=0; indice<numElements; indice++)
		{
			myVector.add(String.valueOf( Math.ceil((Math.random()*1000)) ));
			myList.add(String.valueOf( Math.ceil((Math.random()*1000)) ));
			myLinkedList.add(String.valueOf( Math.ceil((Math.random()*1000)) ));
		}
	}
	
	public static void printElementsFromVector()
	{
		for(String element: myVector)
		{
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void printElementsFromList()
	{
		for(String element: myList)
		{
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void printElementsFromLinkedList()
	{
		for(String element: myLinkedList)
		{
			System.out.println(element);
		}
		System.out.println();
	}	
	
}
