using System;
using System.Collections.Generic;

public class Translation698
{
    public virtual CreateStreamingDistributionResponse CreateStreamingDistribution(CreateStreamingDistributionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateStreamingDistributionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateStreamingDistributionResponseUnmarshaller.Instance;
    return Invoke<CreateStreamingDistributionResponse>(request, options);
}
}