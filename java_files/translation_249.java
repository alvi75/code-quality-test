import java.util.*;

public class Translation249 {
    public RegisterWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) {
    base(request);
}
internal virtual RegisterWorkspaceDirectoryResponse RegisterWorkspaceDirectoryInternal(){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterWorkspaceDirectoryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterWorkspaceDirectoryResponseUnmarshaller.Instance;
    return Invoke<RegisterWorkspaceDirectoryResponse>(options);
}
}