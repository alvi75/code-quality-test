using System;
using System.Collections.Generic;

public class Translation584
{
    public virtual DescribeTopicsDetectionJobResponse DescribeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeTopicsDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeTopicsDetectionJobResponseUnmarshaller.Instance;
    return Invoke<DescribeTopicsDetectionJobResponse>(request, options);
}
}