import java.util.*;

public class Translation918 {
    public StopDominificationResult stopDominification(DominationStatus status) {
    return stopFleetActions(new StopFleetActionsRequest().withDnsAction(status.toString()));
}
}