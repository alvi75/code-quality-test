import java.util.*;

public class Translation179 {
    ublic DescribeMatchmakingRuleSetsResponse DescribeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeMatchmakingRuleSetsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeMatchmakingRuleSetsResponseUnmarshaller.Instance;
    return Invoke<DescribeMatchmakingRuleSetsResponse>(request, options);
}
}