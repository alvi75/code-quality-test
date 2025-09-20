using System;
using System.Collections.Generic;

public class Translation990
{
    public virtual GetLifecyclePolicyPreviewResponse GetLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetLifecyclePolicyPreviewRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetLifecyclePolicyPreviewResponseUnmarshaller.Instance;
    return Invoke<GetLifecyclePolicyPreviewResponse>(request, options);
}
}