using System;
using System.Collections.Generic;

public class Translation533
{
    public virtual DescribeDataSetResponse DescribeDataSet(DescribeDataSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDataSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDataSetResponseUnmarshaller.Instance;
    return Invoke<DescribeDataSetResponse>(request, options);
}
}