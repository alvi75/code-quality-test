using System;
using System.Collections.Generic;

public class Translation918
{
    public virtual StopDominantLanguageDetectionJobResponse StopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopDominantLanguageDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopDominantLanguageDetectionJobResponseUnmarshaller.Instance;
    return Invoke<StopDominantLanguageDetectionJobResponse>(request, options);
}
}