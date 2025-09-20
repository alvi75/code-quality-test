using System;
using System.Collections.Generic;

public class Translation797
{
    public virtual CreateDocumentationPartResponse CreateDocumentationPart(CreateDocumentationPartRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDocumentationPartRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDocumentationPartResponseUnmarshaller.Instance;
    return Invoke<CreateDocumentationPartResponse>(request, options);
}
}