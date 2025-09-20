using System;
using System.Collections.Generic;

public class Translation508
{
    public virtual ListDatasetGroupsResponse ListDatasetGroups(ListDatasetGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListDatasetGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListDatasetGroupsResponseUnmarshaller.Instance;
    return Invoke<ListDatasetGroupsResponse>(request, options);
}
}