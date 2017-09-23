package juegodeletras;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		
		String mypathentrada = "rapigrama.in";
		String mypathsalida = "rapigrama.out";
		
		Scanner sc = new Scanner(new File(mypathentrada));
		PrintWriter salida = new PrintWriter(new FileWriter(mypathsalida));
		
		int tamañoMat, cantPalabras;
		String [] palabras;
		char [][] matEntrada;
		char [][] matTraspuesta;
		String [] vecEO;
		String [] vecNS;
	
		tamañoMat = sc.nextInt();
		cantPalabras = sc.nextInt();
		
		palabras = new String[cantPalabras];
		matEntrada= new char[tamañoMat][tamañoMat];
		matTraspuesta= new char[tamañoMat][tamañoMat];
		
		for (int i = 0; i < matEntrada.length; i++)
			matEntrada[i] = sc.next().toCharArray();
		matTraspuesta=trasponerMatriz(matEntrada);
		
		for (int i = 0; i < cantPalabras; i++)
			palabras[i] = sc.next();
		
		sc.close();
		
		vecEO = new String [tamañoMat];
		vecNS = new String [tamañoMat];
		
		for (int i = 0; i < matEntrada.length; i++) {
			String cadena = null;
			for (int j = 0; j < matEntrada.length; j++) {
				cadena += matEntrada[i][j];
			}
			vecEO[i] = cadena;
		}
		
		for (int i = 0; i < matTraspuesta.length; i++) {
			String cadena = null;
			for (int j = 0; j < matTraspuesta.length; j++) {
				cadena += matTraspuesta[i][j];
			}
			vecNS[i] = cadena;
		}
		
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < vecEO.length; j++) {
					if(vecEO[j].contains(palabras[i])){
						salida.println(i+1 + " " + 'E');
						break;
					}
					if(invertirCadena(vecEO[j]).contains(palabras[i])){
						salida.println(i+1 + " " + 'O');
						break;
					}
				
			}
		}
		
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j< vecNS.length; j++) {
					if(vecNS[j].contains(palabras[i])){
						salida.println(i+1 + " " + 'S');
						break;
					}
					if(invertirCadena(vecNS[j]).contains(palabras[i])){
						salida.println(i+1 + " " + 'N');
						break;
					}
				
			}
		}
		
		
		
		
		
		salida.close();
	}
	
	
	public static char [][] trasponerMatriz (char [][] matEntrada){
		
		char[][] matSalida = new char[matEntrada.length][matEntrada.length];
		
		for (int i = 0; i < matEntrada.length; i++) {
			
			for (int j = 0; j < matSalida.length; j++) {
				matSalida[j][i] = matEntrada [i][j];
			}
		}		
		
		
		return matSalida;
		
	}

	public static String invertirCadena (String a){
		String invertido = null;
		for(int i=a.length()-1;i >= 0;i--){
			invertido+=a.charAt(i);
		}
		return invertido;
	}
	
}
