
package jcommon.init;

import java.lang.Throwable; /**
 *
 * @author David Hoyt <dhoyt@hoytsoft.org>
 */
public interface ISystemLoader {
	void load() throws Throwable;
	void unload() throws Throwable;
}
