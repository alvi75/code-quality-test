import java.util.*;

public class Translation287 {
    ublic ReleaseHostsResponse ReleaseHosts(ReleaseHostsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ReleaseHostsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ReleaseHostsResponseUnmarshaller.Instance;
    return Invoke<ReleaseHostsResponse>(request, options);
}
}