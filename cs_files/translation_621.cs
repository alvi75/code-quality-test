using System;
using System.Collections.Generic;

public class Translation621
{
    public virtual CompleteVaultLockResponse CompleteVaultLock(CompleteVaultLockRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CompleteVaultLockRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CompleteVaultLockResponseUnmarshaller.Instance;
    return Invoke<CompleteVaultLockResponse>(request, options);
}
}