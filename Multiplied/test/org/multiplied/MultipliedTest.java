package org.multiplied;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class MultipliedTest {

	@Test
	void testGetRsult() {
		String res = Multiplied.getRsult(123, 52);
		
		assertEquals(res, res);
	}

	@Test
	void testGetSpaces() {

	String spaces = Multiplied.getSpaces(125);
	
	assertEquals(spaces, spaces);
	
	}

	@Test
	void testGetMinuses() {

	String minuses = Multiplied.getMinuses(12);
	
	assertEquals(minuses, minuses);
	}

	@Test
	void testGetRows() {

	String result = Multiplied.getRows(12, 125, 44);
	
	assertEquals(result, result);
	
	}

}
