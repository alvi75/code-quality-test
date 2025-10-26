import java.util.*;

public class Translation926 {
    public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = TerminateClientVpnConnectionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TerminateClientVpnConnectionsResponseUnmarshaller.Instance;
    return Invoke<TerminateClientVpnConnectionsResult>(request, options);
}
}