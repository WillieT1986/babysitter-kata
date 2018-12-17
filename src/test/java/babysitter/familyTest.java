package babysitter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FamilyTest {

	@Test
	public void shouldInstantiateFamily() {
		Family underTest = new Family("name", 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldRetrieveFamilyLetter() {
		Family underTest = new Family("name", 0, 0);
		String check = underTest.getFamilyName();
		assertEquals("name", check);
	}

	@Test
	public void shouldReturnFamilyPayRate() {
		Family underTest = new Family("name", 15, 0);
		int check = underTest.getPayRate();
		assertEquals(15, check);
	}

	@Test
	public void shouldReturnFamilyHours() {
		Family underTest = new Family("name", 0, 1700);
		int check = underTest.getFamilyHours();
		assertEquals(1700, check);
	}

}