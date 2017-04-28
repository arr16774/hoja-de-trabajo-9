package hoja9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import com.sun.nio.sctp.Association;

public class Texto {
	FactoryTree factory = new FactoryTree();
	iTree<String,String> b;
	public void s() throws IOException {
		String a = "";
		BufferedReader txt = new BufferedReader(new FileReader("freedict-eng-spa.dic"));
		String palabra;
		while((palabra=txt.readLine())!=null){
			a=a+" "+palabra;
			llenar(palabra);
			}
		}
	
	public void setTree(String seleccion){
		b=factory.choose(seleccion);
		if (b instanceof SplayBST){
			System.out.println("BST");
		}else if (b instanceof TwoThreeTree){
			System.out.println("2-3 Three");
		}
		
	}
	
	public void llenar(String palabra){
		String cadena = palabra.replaceAll(" ", ",");
		cadena = cadena.replaceAll("\t", ",");
		String palabras[]= cadena.split(",");
		b.put(palabras[0], palabras[1]);
		//System.out.println(".");
	}
	public String lectura() throws IOException{
		String a = ""; 
	
		JFileChooser archivo = new JFileChooser();
		archivo.showOpenDialog(null);
		BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
		String pal;
		while(reader.ready()){
			while ((pal=reader.readLine())!= null){
				a=a+" "+pal;
			}
			//String w=tree.find(new Association<String, String>("yes","si")).toString();
			System.out.println("El archivo original es: " + a);
			return a;
		}
		return a;
	}
	
	/**
	 * @param texto a ser traducido
	 * @return texto traducid0
	 * Metodo toma un texto, lo separa, y luego busca coincidencias en el binary tree. De no encontrarlas agrega a la cadena de "texto traducido" la palabra
	 * ingresada entre asteriscos
	 */
	public String traduccion(String texto){
		String traducido="";
		texto = texto.toLowerCase();
		String palabrasATraducir[] = texto.split("\\s+");
		for (int i=0; i<palabrasATraducir.length;i++){
			String x =palabrasATraducir[i];
			if ( b.get(palabrasATraducir[i]) != null){
				traducido = traducido + b.get(palabrasATraducir[i]).toString() +" ";
			}else{
				traducido = traducido + "*"+x+"* ";
			}
		}
		return traducido;
	}

}