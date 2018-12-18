package babysitter;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class FamilyTest {
	private static final String FAMILY_LETTER = "name";
	private static final int PAY_RATE = 15;
	private static final int HOURS = 1700;

	private Family underTest;

	@Before
	public void setUp() {
		underTest = new Family(FAMILY_LETTER, PAY_RATE, HOURS);
	}

	@Test
	public void shouldInstantiateFamily() {
		assertNotNull(underTest);
	}

	@Test
	public void shouldRetrieveFamilyLetter() {
		String check = underTest.getFamilyName("A");
		assertEquals("name", check);
	}

	@Test
	public void shouldReturnFamilyPayRate() {
		int check = underTest.getPayRate();
		assertEquals(15, check);
	}

	@Test
	public void shouldReturnFamilyHours() {
		int check = underTest.getFamilyHours();
		assertEquals(1700, check);
	}

	@Test
	public void shouldReturnMultipleFamilyLetters() {
		Family underTest = new Family("name1", 0, 0);
		Family underTest2 = new Family("name2", 0, 0);
		String check = underTest.getFamilyName("A");
		String check2 = underTest2.getFamilyName("B");
		assertEquals("name1", check);
		assertEquals("name2", check2);
	}

	@Test
	public void shouldReturnFamilyLetterPayAndHours() {
		Family underTest = new Family("A", 15, 1700);
		String check = underTest.getFamilyName("A");
		int check2 = underTest.getPayRate();
		int check3 = underTest.getFamilyHours();
		assertEquals("A", check);
		assertEquals(15, check2);
		assertEquals(1700, check3);
	}

	@Test
	public void shouldReturnMultipleFamilies() {
		String anotherFamily = "D";
		Family familyA = new Family("A", PAY_RATE, HOURS);
		Family familyD = new Family(anotherFamily, PAY_RATE, HOURS);
		underTest.families().add(familyA);
		underTest.families().add(familyD);
		Collection<Family> families = underTest.families();
		assertThat(families, containsInAnyOrder(familyA, familyD));
		assertTrue(families.contains(familyA));
		assertTrue(families.contains(familyD));
		assertEquals(2, families.size());

	}

}