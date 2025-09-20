using System;
using System.Collections.Generic;

public class Translation145
{
    public virtual UpdateContributorInsightsResponse UpdateContributorInsights(UpdateContributorInsightsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateContributorInsightsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateContributorInsightsResponseUnmarshaller.Instance;
    return Invoke<UpdateContributorInsightsResponse>(request, options);
}
}