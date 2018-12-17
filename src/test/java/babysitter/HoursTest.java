package babysitter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HoursTest {
	
	@Test
	public void shouldConstructWorkingHours() {
		Hours underTest = new Hours(1100);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldReturnWorkingHours() {
		Hours underTest = new Hours(1100);
		int check = underTest.getWork();
		assertEquals(1100, check);
	}
	
}
