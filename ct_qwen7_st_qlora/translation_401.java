import java.util.*;

public class Translation401 {
    public GetRouteResult getRoute(GetRouteRequest request) {
    request = beforeClientExecution(request);
    return executeGetRoute(request);
}
}