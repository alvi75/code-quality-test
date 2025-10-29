import java.util.*;

public class Translation266 {
    ublic GetFolderResponse GetFolder(GetFolderRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetFolderRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetFolderResponseUnmarshaller.Instance;
    return Invoke<GetFolderResponse>(request, options);
}
}