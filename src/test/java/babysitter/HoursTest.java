package babysitter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HoursTest {
	
	@Test
	public void shouldConstructWorkingHours() {
		Hours underTest = new Hours(1700, 1200);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldReturnWorkingHours() {
		Hours underTest = new Hours(1700, 1200);
		int check = underTest.getWork(1800);
		assertEquals(1700, check);
	}
	
	@Test
	public void shouldReturnNonWorkingHour() {
		Hours underTest = new Hours(1700, 1200);
		int check = underTest.getNonWork(1100);
		assertEquals(1200, check);
	}
}
