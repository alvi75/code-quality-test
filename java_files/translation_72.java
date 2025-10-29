import java.util.*;

public class Translation72 {
    ublic AllocateHostedConnectionResponse AllocateHostedConnection(AllocateHostedConnectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AllocateHostedConnectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AllocateHostedConnectionResponseUnmarshaller.Instance;
    return Invoke<AllocateHostedConnectionResponse>(request, options);
}
}