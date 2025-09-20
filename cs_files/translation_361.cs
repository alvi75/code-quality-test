using System;
using System.Collections.Generic;

public class Translation361
{
    public virtual DescribeDocumentVersionsResponse DescribeDocumentVersions(DescribeDocumentVersionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDocumentVersionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDocumentVersionsResponseUnmarshaller.Instance;
    return Invoke<DescribeDocumentVersionsResponse>(request, options);
}
}