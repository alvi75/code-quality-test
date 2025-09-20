using System;
using System.Collections.Generic;

public class Translation241
{
    public virtual CreateResolverRuleResponse CreateResolverRule(CreateResolverRuleRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateResolverRuleRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateResolverRuleResponseUnmarshaller.Instance;
    return Invoke<CreateResolverRuleResponse>(request, options);
}
}