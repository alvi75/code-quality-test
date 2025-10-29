import java.util.*;

public class Translation797 {
    ublic CreateDocumentationPartResponse CreateDocumentationPart(CreateDocumentationPartRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDocumentationPartRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDocumentationPartResponseUnmarshaller.Instance;
    return Invoke<CreateDocumentationPartResponse>(request, options);
}
}