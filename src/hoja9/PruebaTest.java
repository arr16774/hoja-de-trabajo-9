package hoja9;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaTest {

	@Test
	public void test() {
		SplayBST<String,String> b = new SplayBST<String,String>();
		b.put("Hello", "hola");
		b.put("night", "noche");
		b.put("silver", "plata");
		assertEquals("noche",b.get("night"));
	}

}
