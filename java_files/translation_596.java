import java.util.*;

public class Translation596 {
    ublic CreateMatchmakingRuleSetResponse CreateMatchmakingRuleSet(CreateMatchmakingRuleSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateMatchmakingRuleSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateMatchmakingRuleSetResponseUnmarshaller.Instance;
    return Invoke<CreateMatchmakingRuleSetResponse>(request, options);
}
}