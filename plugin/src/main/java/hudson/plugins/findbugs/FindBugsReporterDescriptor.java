package hudson.plugins.findbugs;

import hudson.Extension;
import hudson.plugins.analysis.core.ReporterDescriptor;


/**
 * Descriptor for the class {@link FindBugsReporter}. Used as a singleton. The
 * class is marked as public so that it can be accessed from views.
 *
 * @author Ulli Hafner
 */
@Extension(ordinal = 100, optional = true) // NOCHECKSTYLE
public class FindBugsReporterDescriptor extends ReporterDescriptor {
    /**
     * Creates a new instance of <code>FindBugsReporterDescriptor</code>.
     */
    public FindBugsReporterDescriptor() {
        super(FindBugsReporter.class, new FindBugsDescriptor());
    }
}
