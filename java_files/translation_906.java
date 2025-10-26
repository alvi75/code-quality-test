import java.util.*;

public class Translation906 {
    ublic RebootNodeResponse RebootNode(RebootNodeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RebootNodeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RebootNodeResponseUnmarshaller.Instance;
    return Invoke<RebootNodeResponse>(request, options);
}
}