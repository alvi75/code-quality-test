using System;
using System.Collections.Generic;

public class Translation179
{
    public virtual DescribeMatchmakingRuleSetsResponse DescribeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeMatchmakingRuleSetsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeMatchmakingRuleSetsResponseUnmarshaller.Instance;
    return Invoke<DescribeMatchmakingRuleSetsResponse>(request, options);
}
}