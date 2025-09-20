using System;
using System.Collections.Generic;

public class Translation760
{
    public virtual DescribeModelPackageResponse DescribeModelPackage(DescribeModelPackageRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeModelPackageRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeModelPackageResponseUnmarshaller.Instance;
    return Invoke<DescribeModelPackageResponse>(request, options);
}
}