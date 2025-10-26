import java.util.*;

public class Translation553 {
    ublic DeleteNetworkAclEntryResponse DeleteNetworkAclEntry(DeleteNetworkAclEntryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteNetworkAclEntryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteNetworkAclEntryResponseUnmarshaller.Instance;
    return Invoke<DeleteNetworkAclEntryResponse>(request, options);
}
}