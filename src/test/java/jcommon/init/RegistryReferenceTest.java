package jcommon.init;

import jcommon.core.OSFamily;
import org.junit.*;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author David Hoyt <dhoyt@hoytsoft.org>
 */
public class RegistryReferenceTest {

	public RegistryReferenceTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testRegistry() {
    if (OSFamily.getSystemOSFamily() != OSFamily.Windows)
      return;

		assertTrue(Sys.initializeRegistry());
	}
}
