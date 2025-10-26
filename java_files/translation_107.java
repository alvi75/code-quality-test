import java.util.*;

public class Translation107 {
    ublic UpdateDistributionResponse UpdateDistribution(UpdateDistributionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateDistributionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateDistributionResponseUnmarshaller.Instance;
    return Invoke<UpdateDistributionResponse>(request, options);
}
}