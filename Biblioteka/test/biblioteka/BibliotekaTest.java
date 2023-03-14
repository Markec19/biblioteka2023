package biblioteka;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import biblioteka.interfejs.BibliotekaInterfejsTest;

public class BibliotekaTest extends BibliotekaInterfejsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Biblioteka biblioteka = new Biblioteka(); 
	}

	@AfterEach
	void tearDown() throws Exception {
		biblioteka = null;
	}
	
	
}
