import java.util.*;

public class Translation177 {
    ublic virtual StopWorkspacesResponse StopWorkspaces(StopWorkspacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopWorkspacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopWorkspacesResponseUnmarshaller.Instance;
    return Invoke<StopWorkspacesResponse>(request, options);
}
}