using System;
using System.Collections.Generic;

public class Translation103
{
    public virtual CreateDistributionWithTagsResponse CreateDistributionWithTags(CreateDistributionWithTagsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDistributionWithTagsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDistributionWithTagsResponseUnmarshaller.Instance;
    return Invoke<CreateDistributionWithTagsResponse>(request, options);
}
}