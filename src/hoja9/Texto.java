package hoja9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.sun.nio.sctp.Association;

public class Texto {
	
	TwoThreeTree<String,String> b = new TwoThreeTree();
	
	
	public void s() throws IOException {
		String a = "";
		BufferedReader txt = new BufferedReader(new FileReader("freedic-eng-spa.txt"));
		String palabra;
		while((palabra=txt.readLine())!=null){
			a=a+" "+palabra;
			llenar(palabra);
			}
		}
	
	public void llenar(String palabra){
		String cadena = palabra.replaceAll(" ", ",");
		cadena = cadena.replaceAll("\t", ",");
		String palabras[]= palabra.split(",");
		b.put(palabras[0], palabras[1]);
	}

}