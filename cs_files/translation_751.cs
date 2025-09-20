using System;
using System.Collections.Generic;

public class Translation751
{
    public virtual ModifyAccountResponse ModifyAccount(ModifyAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyAccountResponseUnmarshaller.Instance;
    return Invoke<ModifyAccountResponse>(request, options);
}
}