using System;
using System.Collections.Generic;

public class Translation199
{
    public virtual DeleteLifecyclePolicyResponse DeleteLifecyclePolicy(DeleteLifecyclePolicyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteLifecyclePolicyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteLifecyclePolicyResponseUnmarshaller.Instance;
    return Invoke<DeleteLifecyclePolicyResponse>(request, options);
}
}