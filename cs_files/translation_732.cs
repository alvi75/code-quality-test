using System;
using System.Collections.Generic;

public class Translation732
{
    public virtual DeleteDocumentationPartResponse DeleteDocumentationPart(DeleteDocumentationPartRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDocumentationPartRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDocumentationPartResponseUnmarshaller.Instance;
    return Invoke<DeleteDocumentationPartResponse>(request, options);
}
}