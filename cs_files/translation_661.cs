using System;
using System.Collections.Generic;

public class Translation661
{
    public virtual DescribeLifecycleHooksResponse DescribeLifecycleHooks(DescribeLifecycleHooksRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeLifecycleHooksRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeLifecycleHooksResponseUnmarshaller.Instance;
    return Invoke<DescribeLifecycleHooksResponse>(request, options);
}
}