package descubriendoNombresRepetidos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NombresRepetidos1 {
	
	String [] nombre;
	int repeticion;
	
	private NombresRepetidos1 (String nombre, int repeticion)
	{
		this.nombre= nombre;
		this.repeticion= repeticion;
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		String path= "C:\\Users\\laboratorios\\workspace\\NombresRepetidos\\";
		Scanner sc= new Scanner (new File (path + "entrada.in"));
		
		ArrayList<NombresRepetidos1> vec = new ArrayList <NombresRepetidos1>();
		
		int tamaño = sc.nextInt();
		int repeticiones = sc.nextInt();
		
		for( int i = 0 ; i< tamaño ; i++)
		{
			vec.add(new NombresRepetidos1(sc.nextLine(), 0)));
		}
		
		Collections.sort(vec);
		
		for(int i=0 ; i< tamaño ; i++)
		{
			for(int j=0; j<tamaño; j++)
			{
				if(vec.get(i) )
				
			}
		}
		

	}


	public String[] getNombre() {
		return nombre;
	}


	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}

}
