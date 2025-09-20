using System;
using System.Collections.Generic;

public class Translation842
{
    public virtual ListDominantLanguageDetectionJobsResponse ListDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListDominantLanguageDetectionJobsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListDominantLanguageDetectionJobsResponseUnmarshaller.Instance;
    return Invoke<ListDominantLanguageDetectionJobsResponse>(request, options);
}
}