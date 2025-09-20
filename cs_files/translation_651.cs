using System;
using System.Collections.Generic;

public class Translation651
{
    public virtual DescribeMountTargetSecurityGroupsResponse DescribeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeMountTargetSecurityGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeMountTargetSecurityGroupsResponseUnmarshaller.Instance;
    return Invoke<DescribeMountTargetSecurityGroupsResponse>(request, options);
}
}