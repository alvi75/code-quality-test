using System;
using System.Collections.Generic;

public class Translation449
{
    public virtual StopSentimentDetectionJobResponse StopSentimentDetectionJob(StopSentimentDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopSentimentDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopSentimentDetectionJobResponseUnmarshaller.Instance;
    return Invoke<StopSentimentDetectionJobResponse>(request, options);
}
}