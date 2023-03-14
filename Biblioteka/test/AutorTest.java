import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import biblioteka.Autor;

public class AutorTest {
	
	Autor a;

	@BeforeEach
	void setUp() throws Exception {
		a = new Autor();
	}

	@AfterEach
	void tearDown() throws Exception {
		a = null;
	}

	@Test
	void testSetImeSveOk() {
		a.setIme("Pera");
		
		assertEquals("Pera", a.getIme());
	}
	
	@Test
	void testSetImeNull() {
		Exception e = assertThrows(NullPointerException.class, 
				() -> a.setIme(null));
		
		assertEquals("Ime ne moze biti null", e.getMessage());
	}
	
	@Test
	void testSetImePrazanString() {
		Exception e = assertThrows(IllegalArgumentException.class, 
				() -> a.setIme(""));
	}
	
	@Test
	void testSetPrezimeSveOk() {
		a.setPrezime("Peric");
		
		assertEquals("Peric", a.getPrezime());
	}
	
	@Test
	void testSetPrezimeNull() {
		Exception e = assertThrows(NullPointerException.class, 
				() -> a.setPrezime(null));
		
		assertEquals("Prezime ne moze biti null", e.getMessage());
	}
	
	@Test
	void testSetPrezimePrazanString() {
		Exception e = assertThrows(IllegalArgumentException.class, 
				() -> a.setPrezime(""));
	}
	
	@Test
	@DisplayName ("Test za proveru toString metode")
	void testToString() {
		a.setIme("Zika");
		a.setPrezime("Zikic");
		
		String s = a.toString();
		
		assertTrue(s.contains("Zika"));
		assertTrue(s.contains("Zikic"));
	}
	
	@ParameterizedTest
	@CsvSource  ({
		"Pera, Peric, Pera, Peric, true",
		"Pera, Peric, Zika, Zikic, false",
		"Pera, Peric, Pera, Zikic, false",
		"Pera, Peric, Zika, Peric, false",
	})
	void testEquals(String ime1, String prezime1,
			String ime2, String prezime2, boolean isti) {
		a.setIme(ime1);
		a.setPrezime(prezime1);
		
		Autor a2 = new Autor();
		a2.setIme(ime2);
		a2.setPrezime(prezime2);
		
		assertEquals(isti, a.equals(a2));
	}
	
	@Test
	void testEqualsNull() {
		assertFalse(a.equals(null));
	}
	
	@Test
	void testEqualsIsti() {
		assertTrue(a.equals(a));
	}
	
	@Test
	void testEqualsDrugaKlasa() {
		assertFalse(a.equals(new Exception()));
	}
}
