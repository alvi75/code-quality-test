using System;
using System.Collections.Generic;

public class Translation701
{
    public virtual DescribeAliasResponse DescribeAlias(DescribeAliasRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeAliasRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeAliasResponseUnmarshaller.Instance;
    return Invoke<DescribeAliasResponse>(request, options);
}
}