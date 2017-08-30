package japoneses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Luchador {
	
	private double peso;
	private double altura;
	
	
	public Luchador(double peso, double altura)
	{
		this.peso = peso;
		this.altura = altura;
	}

	public static void main(String[] args) throws FileNotFoundException{
		String path = "C:\\Users\\laboratorios\\workspace\\LuchadoresJaponeses\\";
		Scanner sc = new Scanner(new File(path + "entrada.in"));
		
		int tamaño = sc.nextInt();
		ArrayList<Luchador> vec = new ArrayList<Luchador>();
		
		for(int i=0; i < tamaño; i++)
		{
			vec.add(new Luchador(sc.nextDouble(), sc.nextDouble()));
		}
		
		sc.close();
		
		int [] resultados = new int[tamaño];
		
		for(int i=0; i < tamaño; i++)
		{
			for(int j=0; j < tamaño; j++)
			{
				if(j!=i)
				{					
					if(vec.get(i).peso >= vec.get(j).peso && vec.get(i).altura >= vec.get(j).altura)
					{
						resultados[i]++;
					}
						
				}
				
				
			}
		}
		
		PrintWriter salida = new PrintWriter(new File(path + "salida.out"));
		
		for(int i=0; i < tamaño; i++)
		{
			salida.println(resultados[i]);
		}
		
		salida.close();

	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return peso + " " + altura;
	}
}
