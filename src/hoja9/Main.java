package hoja9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("SELECCIONE EL ARCHIVO QUE DESEA TRADUCIR\n\n");
		String text="1";
		Scanner teclado= new Scanner(System.in);
		Texto trad= new Texto();
		String aTrad = trad.lectura();
		boolean bandera = true;
		while(bandera){
			System.out.println("Desea usar:\n1.Two-Three tree\n2.Splay Tree");
			text= teclado.nextLine();
			if (text.equals("1")||text.equals("2")){
				System.out.println("\nEl diccionario esta cargando...");
				bandera=false;
			}else{
				System.out.println("\nPor favor ingrese una opcion valida");
			}
		}
		trad.setTree(text);
		trad.s();
		System.out.println("\nEl diccionario termino de cargar!");
		System.out.println(trad.traduccion(aTrad));
	}
}
