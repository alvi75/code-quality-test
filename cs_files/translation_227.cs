using System;
using System.Collections.Generic;

public class Translation227
{
    public virtual GetJobUnlockCodeResponse GetJobUnlockCode(GetJobUnlockCodeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetJobUnlockCodeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetJobUnlockCodeResponseUnmarshaller.Instance;
    return Invoke<GetJobUnlockCodeResponse>(request, options);
}
}