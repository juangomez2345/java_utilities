package llenarmatriz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Matriz 
{
	
	public int rangoMatriz = 4;
	public int longitudMatriz = rangoMatriz * rangoMatriz;
	public int[][] matriz = new int[rangoMatriz][rangoMatriz];
	public int[] arregloNumeros = new int[rangoMatriz * rangoMatriz];
	public List<Integer> setNumeros = new ArrayList<Integer>();
	
	public Matriz()
	{
		numerosAleatorios();
		cargaNumerosAleatorios();
		//imprimeArregloNumeros();
		llenaMatriz();
		imprimeMatriz();
	}
	
	public void numerosAleatorios()
	{
		Random random = new Random();
		
		while(setNumeros.size() < longitudMatriz)
		{
			int numero = random.nextInt(longitudMatriz) + 1;
			if(!setNumeros.contains(numero))
			{
				setNumeros.add(numero);
			}
		}
	}
	
	public void cargaNumerosAleatorios()
	{
		int indiceX = 0;
		for(Integer numero : setNumeros)
		{
			arregloNumeros[indiceX] = numero;
			indiceX++;
		}
	}
	
	public void imprimeArregloNumeros()
	{
		System.out.println();
		for(int indiceX=0; indiceX<longitudMatriz; indiceX++)
		{
			System.out.print(arregloNumeros[indiceX] + " ");
		}
		System.out.println();
	}
	
	
	public void llenaMatriz()
	{
		int indiceArregloNumeros = 0;
		for(int indiceX = 0; indiceX < rangoMatriz; indiceX++)
		{
			for(int indiceY = 0; indiceY < rangoMatriz; indiceY++)
			{
				matriz[indiceX][indiceY] = arregloNumeros[indiceArregloNumeros];
				indiceArregloNumeros++;
			}
		}
	}
	
	public void imprimeMatriz()
	{
		System.out.println();
		
		for(int indiceX = 0; indiceX < rangoMatriz; indiceX++)
		{
			for(int indiceY = 0; indiceY < rangoMatriz; indiceY++)
			{
				System.out.print(matriz[indiceX][indiceY] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		new Matriz();
	}
	
}
