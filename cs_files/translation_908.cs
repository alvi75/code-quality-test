using System;
using System.Collections.Generic;

public class Translation908
{
    public virtual CreateOrUpdateTagsResponse CreateOrUpdateTags(CreateOrUpdateTagsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateOrUpdateTagsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateOrUpdateTagsResponseUnmarshaller.Instance;
    return Invoke<CreateOrUpdateTagsResponse>(request, options);
}
}