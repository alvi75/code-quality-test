import java.util.*;

public class Translation952 {
    ublic virtual DeregisterWorkspaceDirectoryResponse DeregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeregisterWorkspaceDirectoryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeregisterWorkspaceDirectoryResponseUnmarshaller.Instance;
    return Invoke<DeregisterWorkspaceDirectoryResponse>(request, options);
}
}