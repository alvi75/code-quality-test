using System;
using System.Collections.Generic;

public class Translation787
{
    public virtual ListHyperParameterTuningJobsResponse ListHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListHyperParameterTuningJobsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListHyperParameterTuningJobsResponseUnmarshaller.Instance;
    return Invoke<ListHyperParameterTuningJobsResponse>(request, options);
}
}