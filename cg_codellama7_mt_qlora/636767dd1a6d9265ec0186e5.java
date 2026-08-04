import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    public void addNewTarget(Channels channels, IConsumer consumer) {
        if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled())
            SibTr.entry(this, tc, "addNewTarget", new Object[] { channels, consumer });

        // Add the new target to the list of targets
        _targets.add(new Target(channels, consumer));

        if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled())
            SibTr.exit(this, tc, "addNewTarget");
    }
}