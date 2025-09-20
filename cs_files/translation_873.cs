using System;
using System.Collections.Generic;

public class Translation873
{
    public virtual CreateExperimentResponse CreateExperiment(CreateExperimentRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateExperimentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateExperimentResponseUnmarshaller.Instance;
    return Invoke<CreateExperimentResponse>(request, options);
}
}