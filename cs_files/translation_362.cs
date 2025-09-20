using System;
using System.Collections.Generic;

public class Translation362
{
    public virtual ListPublishingDestinationsResponse ListPublishingDestinations(ListPublishingDestinationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListPublishingDestinationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListPublishingDestinationsResponseUnmarshaller.Instance;
    return Invoke<ListPublishingDestinationsResponse>(request, options);
}
}