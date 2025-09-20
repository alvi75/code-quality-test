using System;
using System.Collections.Generic;

public class Translation431
{
    public virtual PostAgentProfileResponse PostAgentProfile(PostAgentProfileRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PostAgentProfileRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PostAgentProfileResponseUnmarshaller.Instance;
    return Invoke<PostAgentProfileResponse>(request, options);
}
}