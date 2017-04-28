package hoja9;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		Texto trad= new Texto();
		trad.s();
		trad.lectura();
		System.out.println(trad.traduccion(trad.lectura()));
	}
}
