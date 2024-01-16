package dat102.f02.tabellbag;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabellBagTest {

	@Test
	void test() {
		fail("Not yet implemented");
		
		
		
		BagADT<String> bag = new TabellBag<>(2);
		
		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.getCurrentSize()==0);
		assertTrue(bag.isEmpty());
		
		boolean ok = bag.add("Per");
		assertTrue(ok);
		
		ok = bag.add("Pål");
		assertTrue(ok);
		
		assertEquals(2, bag.getCurrentSize());
		assertFalse(bag.isEmpty());
		
		ok = bag.add("Espen");
		assertFalse(ok);
		assertEquals(2, bag.getCurrentSize());
		
		assertTrue(bag.contains("Per"));
		assertTrue(bag.contains("Anne"));
		
		bag.clear();
		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.isEmpty());
		

	}

}
