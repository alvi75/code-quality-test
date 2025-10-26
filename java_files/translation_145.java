import java.util.*;

public class Translation145 {
    ublic UpdateContributorInsightsResponse UpdateContributorInsights(UpdateContributorInsightsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateContributorInsightsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateContributorInsightsResponseUnmarshaller.Instance;
    return Invoke<UpdateContributorInsightsResponse>(request, options);
}
}