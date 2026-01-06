import java.util.*;

public class Translation287 {
    public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ReleaseHostsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ReleaseHostsResponseUnmarshaller.Instance;
    return Invoke<ReleaseHostsResult>(request, options);
}
}