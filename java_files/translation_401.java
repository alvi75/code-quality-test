import java.util.*;

public class Translation401 {
    public GetRouteResponse getRoute(GetRouteRequest request) {
    request = beforeClientExecution(request);
    return executeGetRoute(request);
}
}