using System;
using System.Collections.Generic;

public class Translation840
{
    public virtual StopKeyPhrasesDetectionJobResponse StopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopKeyPhrasesDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopKeyPhrasesDetectionJobResponseUnmarshaller.Instance;
    return Invoke<StopKeyPhrasesDetectionJobResponse>(request, options);
}
}