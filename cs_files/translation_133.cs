using System;
using System.Collections.Generic;

public class Translation133
{
    public virtual DescribeCacheSubnetGroupsResponse DescribeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeCacheSubnetGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeCacheSubnetGroupsResponseUnmarshaller.Instance;
    return Invoke<DescribeCacheSubnetGroupsResponse>(request, options);
}
}