using System;
using System.Collections.Generic;

public class Translation795
{
    public virtual DescribeDBSnapshotsResponse DescribeDBSnapshots(DescribeDBSnapshotsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBSnapshotsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBSnapshotsResponseUnmarshaller.Instance;
    return Invoke<DescribeDBSnapshotsResponse>(request, options);
}
}