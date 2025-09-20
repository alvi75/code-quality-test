using System;
using System.Collections.Generic;

public class Translation415
{
    public virtual DescribeSpotFleetRequestsResponse DescribeSpotFleetRequests(DescribeSpotFleetRequestsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeSpotFleetRequestsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeSpotFleetRequestsResponseUnmarshaller.Instance;
    return Invoke<DescribeSpotFleetRequestsResponse>(request, options);
}
}