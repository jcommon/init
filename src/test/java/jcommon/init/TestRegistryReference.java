
package jcommon.init;

import jcommon.Sys;
import jcommon.extract.Resources;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author David Hoyt <dhoyt@hoytsoft.org>
 */
public class TestRegistryReference extends RegistryReference {

	@Override
	public void register() throws Throwable {
		assertTrue(true);
	}

	@Override
	public void unregister() throws Throwable {
		assertTrue(true);
	}

	@Override
	public Resources createResourceExtractor() {
		return Resources.newInstance(
        Sys.createPlatformPackageResourceName("resources.extraction", "test.xml")
    );
	}

}
