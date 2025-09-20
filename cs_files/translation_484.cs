using System;
using System.Collections.Generic;

public class Translation484
{
    public virtual CreateTrafficPolicyResponse CreateTrafficPolicy(CreateTrafficPolicyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateTrafficPolicyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateTrafficPolicyResponseUnmarshaller.Instance;
    return Invoke<CreateTrafficPolicyResponse>(request, options);
}
}