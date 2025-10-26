import java.util.*;

public class Translation858 {
    ublic PutMetricDataResponse PutMetricData(PutMetricDataRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PutMetricDataRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PutMetricDataResponseUnmarshaller.Instance;
    return Invoke<PutMetricDataResponse>(request, options);
}
}