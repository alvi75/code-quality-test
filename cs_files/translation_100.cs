using System;
using System.Collections.Generic;

public class Translation100
{
    public virtual DescribeRepositoriesResponse DescribeRepositories(DescribeRepositoriesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeRepositoriesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeRepositoriesResponseUnmarshaller.Instance;
    return Invoke<DescribeRepositoriesResponse>(request, options);
}
}