import java.util.*;

public class Translation98 {
    ublic CreateWorkspacesResponse CreateWorkspaces(CreateWorkspacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateWorkspacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateWorkspacesResponseUnmarshaller.Instance;
    return Invoke<CreateWorkspacesResponse>(request, options);
}
}