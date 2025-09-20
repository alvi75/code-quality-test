using System;
using System.Collections.Generic;

public class Translation559
{
    public virtual DescribeVaultResponse DescribeVault(DescribeVaultRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeVaultRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeVaultResponseUnmarshaller.Instance;
    return Invoke<DescribeVaultResponse>(request, options);
}
}