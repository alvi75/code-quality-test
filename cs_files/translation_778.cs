using System;
using System.Collections.Generic;

public class Translation778
{
    public virtual AuthorizeSecurityGroupIngressResponse AuthorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AuthorizeSecurityGroupIngressRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AuthorizeSecurityGroupIngressResponseUnmarshaller.Instance;
    return Invoke<AuthorizeSecurityGroupIngressResponse>(request, options);
}
}