package hudson.plugins.findbugs.tokens;

import hudson.Extension;
import hudson.plugins.analysis.tokens.AbstractResultTokenMacro;
import hudson.plugins.findbugs.FindBugsMavenResultAction;
import hudson.plugins.findbugs.FindBugsResultAction;

/**
 * Provides a token that evaluates to the FindBugs build result.
 *
 * @author Ulli Hafner
 */
@Extension(optional = true)
public class FindBugsResultTokenMacro extends AbstractResultTokenMacro {
    /**
     * Creates a new instance of {@link FindBugsResultTokenMacro}.
     */
    @SuppressWarnings("unchecked")
    public FindBugsResultTokenMacro() {
        super("FINDBUGS_RESULT", FindBugsResultAction.class, FindBugsMavenResultAction.class);
    }
}

