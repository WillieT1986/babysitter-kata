package babysitter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FamilyTest {

	@Test
	public void shouldInstantiateFamily() {
		Family underTest = new Family("name");
		assertNotNull(underTest);
	}

	@Test
	public void shouldRetrieveFamilyLetter() {
		Family underTest = new Family("name");
		String check = underTest.getFamilyName();
		assertEquals("name", check);
	}

}