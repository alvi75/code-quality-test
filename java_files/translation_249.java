import java.util.*;

public class Translation249 {
    ublic RegisterWorkspaceDirectoryResponse RegisterWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterWorkspaceDirectoryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterWorkspaceDirectoryResponseUnmarshaller.Instance;
    return Invoke<RegisterWorkspaceDirectoryResponse>(request, options);
}
}