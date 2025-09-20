using System;
using System.Collections.Generic;

public class Translation395
{
    public virtual DescribeDBProxiesResponse DescribeDBProxies(DescribeDBProxiesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBProxiesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBProxiesResponseUnmarshaller.Instance;
    return Invoke<DescribeDBProxiesResponse>(request, options);
}
}