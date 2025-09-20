using System;
using System.Collections.Generic;

public class Translation643
{
    public virtual ListObjectPoliciesResponse ListObjectPolicies(ListObjectPoliciesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListObjectPoliciesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListObjectPoliciesResponseUnmarshaller.Instance;
    return Invoke<ListObjectPoliciesResponse>(request, options);
}
}