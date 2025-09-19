import java.util.*;

public class Translation163 {
    public ReportInstanceStatusResult reportInstanceStatus(ReportInstanceStatusRequest request) {
    request = beforeClientExecution(request);
    return executeReportSnapshot(request);
}
}