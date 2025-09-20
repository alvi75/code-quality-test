using System;
using System.Collections.Generic;

public class Translation26
{
    public virtual DeleteDocumentationVersionResponse DeleteDocumentationVersion(DeleteDocumentationVersionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDocumentationVersionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDocumentationVersionResponseUnmarshaller.Instance;
    return Invoke<DeleteDocumentationVersionResponse>(request, options);
}
}