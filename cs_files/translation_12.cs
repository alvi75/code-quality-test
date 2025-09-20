using System;
using System.Collections.Generic;

public class Translation12
{
    public virtual GetShardIteratorResponse GetShardIterator(GetShardIteratorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetShardIteratorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetShardIteratorResponseUnmarshaller.Instance;
    return Invoke<GetShardIteratorResponse>(request, options);
}
}