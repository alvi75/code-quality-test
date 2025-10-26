import java.util.*;

public class Translation840 {
    ublic StopKeyPhrasesDetectionJobResponse StopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopKeyPhrasesDetectionJobRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopKeyPhrasesDetectionJobResponseUnmarshaller.Instance;
    return Invoke<StopKeyPhrasesDetectionJobResponse>(request, options);
}
}