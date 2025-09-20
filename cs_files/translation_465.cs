using System;
using System.Collections.Generic;

public class Translation465
{
    public virtual CreateAlgorithmResponse CreateAlgorithm(CreateAlgorithmRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateAlgorithmRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateAlgorithmResponseUnmarshaller.Instance;
    return Invoke<CreateAlgorithmResponse>(request, options);
}
}