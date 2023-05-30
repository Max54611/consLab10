package pe.edu.tecsup.lab10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static final Logger log = LogManager.getLogger(CalculatorTest.class); 
	
	static Calculator c;
	
	@BeforeAll
	static void initAll() {
		Configurator.setRootLevel(org.apache.logging.log4j.Level.INFO);
		log.error("initAll()");
	}
	
	@BeforeEach
	void init() {
		log.info("init()....!");
	}
	
	@Test
	public void testAdd() {
		
		c = new Calculator();
		
		int EXPECTED_VALUE=7;
		
		System.out.println("testAdd()");
	
		assertEquals(EXPECTED_VALUE,c.add(4, 3));
	}

	@Test
	public void testSub() {
		
		c = new Calculator();
		
		int EXPECTED_VALUE=1;
		
		System.out.println("testSub()");
		
		assertEquals(EXPECTED_VALUE,c.sub(4, 3));
	}
	
	@AfterEach
	   void tearDown() {
	   	log.info("tearDown()....!");
	   }
	
	@AfterAll
	   static void tearDownAll() {
	   	log.info("tearDownAll()....!");
	   }

}
