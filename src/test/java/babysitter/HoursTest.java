package babysitter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class HoursTest {
	private static final int WORK = 1700;
	private static final int NONWORK = 1200;

	private Hours underTest;

	@Before
	public void setUp() {
		underTest = new Hours(WORK, NONWORK);
	}

	@Test
	public void shouldConstructWorkingHours() {
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnWorkingHours() {
		int check = underTest.getWork(1800);
		assertEquals(WORK, check);
	}

	@Test
	public void shouldReturnNonWorkingHour() {
		int check = underTest.getNonWork(1100);
		assertEquals(NONWORK, check);
	}
}
