using System;
using System.Collections.Generic;

public class Translation530
{
    public virtual GetDeploymentTargetResponse GetDeploymentTarget(GetDeploymentTargetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDeploymentTargetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDeploymentTargetResponseUnmarshaller.Instance;
    return Invoke<GetDeploymentTargetResponse>(request, options);
}
}