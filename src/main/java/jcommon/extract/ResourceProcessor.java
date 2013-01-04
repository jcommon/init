
package jcommon.extract;

import java.lang.annotation.*;

/**
 * Marks a class as something that can process and load resources.
 *
 * @author David Hoyt <dhoyt@hoytsoft.org>
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ResourceProcessor {
	String tagName();
	boolean supportsSize() default false;
}
