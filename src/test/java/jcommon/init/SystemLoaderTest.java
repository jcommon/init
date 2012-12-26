package jcommon.init;

import jcommon.OSFamily;
import jcommon.init.Sys;
import org.junit.*;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author David Hoyt <dhoyt@hoytsoft.org>
 */
public class SystemLoaderTest {

	public SystemLoaderTest() {
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
	public void testSystemLoader() {
    if (OSFamily.getSystemOSFamily() != OSFamily.Windows)
      return;

		assertTrue(Sys.initializeSystem());
	}
}
