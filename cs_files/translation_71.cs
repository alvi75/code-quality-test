using System;
using System.Collections.Generic;

public class Translation71
{
    public virtual MergeShardsResponse MergeShards(MergeShardsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = MergeShardsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = MergeShardsResponseUnmarshaller.Instance;
    return Invoke<MergeShardsResponse>(request, options);
}
}