import java.util.*;

public class Translation732 {
    ublic DeleteDocumentationPartResponse DeleteDocumentationPart(DeleteDocumentationPartRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDocumentationPartRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDocumentationPartResponseUnmarshaller.Instance;
    return Invoke<DeleteDocumentationPartResponse>(request, options);
}
}