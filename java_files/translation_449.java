import java.util.*;

public class Translation449 {
    ublic virtual StopSentimentDetectionJobResponse StopSentimentDetectionJob(StopSentimentDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopSentimentDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopSentimentDetectionJobResponseUnmarshaller.Instance;
    return Invoke<StopSentimentDetectionJobResponse>(request, options);
}
}