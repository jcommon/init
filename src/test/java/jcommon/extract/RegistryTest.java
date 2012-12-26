package jcommon.extract;

import jcommon.OSFamily;
import jcommon.init.Sys;

import org.junit.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.Exception;import static org.junit.Assert.*;

/**
 *
 * @author David Hoyt <dhoyt@hoytsoft.org>
 */
public class RegistryTest {
	//<editor-fold defaultstate="collapsed" desc="Setup">
	public RegistryTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
		//assertTrue("These unit tests require Windows to complete", Sys.isOSFamily(OSFamily.Windows));
	}

	@After
	public void tearDown() {
	}
	//</editor-fold>

	@Test
	public void testRegistry() {
    if (OSFamily.getSystemOSFamily() != OSFamily.Windows)
      return;

		assertTrue(Sys.isOSFamily(OSFamily.Windows));
		assertTrue(Registry.clear());

		assertTrue(Sys.initializeRegistry());

		assertFalse(Registry.isEmpty());
		assertNotNull(Registry.findReference("test"));
	}
}
