

 
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test() {
		
		HashMap <String, String> paises= new HashMap <String, String>();
		
		paises.put("bk", "Barakaldo");
		paises.put("eu", "EEUU");
		paises.put("ko", "Korea");
		
		//comprobar si se han introducido los tres valores
		assertEquals(3, paises.size());
		
		assertEquals("Barakaldo",paises.get("bk"));
		assertNull(paises.get("NO-EXISTE-KEY"));
		
		//comprobar que al meter "Barakaldo" de nuevo no se duplica, sino que lo machacha
		paises.put("bk", "Barakaldo");
		int cont = 0;
		Iterator<String> it = paises.values().iterator(); //@see keySet()
		while(it.hasNext()) {
			String pais = it.next();
			if("Barakaldo".equals(pais)) {
				cont++;
			}
		}
		assertEquals(1, cont);
		
		
		
	}

}
