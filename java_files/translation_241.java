import java.util.*;

public class Translation241 {
    ublic CreateResolverRuleResponse CreateResolverRule(CreateResolverRuleRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateResolverRuleRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateResolverRuleResponseUnmarshaller.Instance;
    return Invoke<CreateResolverRuleResponse>(request, options);
}
}