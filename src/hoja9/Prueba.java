package hoja9;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prueba {

	@Test
	public void test() {
		TwoThreeTree<String,String> b = new TwoThreeTree<String,String>();
		b.put("Hello", "hola");
		b.put("night", "noche");
		b.put("silver", "plata");
		assertEquals("plata",b.get("silver"));
	}

}
