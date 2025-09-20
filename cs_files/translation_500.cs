using System;
using System.Collections.Generic;

public class Translation500
{
    public virtual DeleteImageResponse DeleteImage(DeleteImageRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteImageRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteImageResponseUnmarshaller.Instance;
    return Invoke<DeleteImageResponse>(request, options);
}
}