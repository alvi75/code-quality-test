using System;
using System.Collections.Generic;

public class Translation763
{
    public virtual UpdateS3ResourcesResponse UpdateS3Resources(UpdateS3ResourcesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateS3ResourcesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateS3ResourcesResponseUnmarshaller.Instance;
    return Invoke<UpdateS3ResourcesResponse>(request, options);
}
}