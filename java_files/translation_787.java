import java.util.*;

public class Translation787 {
    ublic ListHyperParameterTuningJobsResponse ListHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListHyperParameterTuningJobsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListHyperParameterTuningJobsResponseUnmarshaller.Instance;
    return Invoke<ListHyperParameterTuningJobsResponse>(request, options);
}
}