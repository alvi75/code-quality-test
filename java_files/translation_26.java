import java.util.*;

public class Translation26 {
    ublic DeleteDocumentationVersionResponse DeleteDocumentationVersion(DeleteDocumentationVersionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDocumentationVersionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDocumentationVersionResponseUnmarshaller.Instance;
    return Invoke<DeleteDocumentationVersionResponse>(request, options);
}
}