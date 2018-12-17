package babysitter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FamilyTest {

	
	@Test
	public void shouldInstantiateFamily() {
		Family underTest = new Family();
		assertNotNull(underTest);
	}
}