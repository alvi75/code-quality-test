import java.util.*;

public class Translation774 {
    ublic StopTaskResponse StopTask(StopTaskRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopTaskRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopTaskResponseUnmarshaller.Instance;
    return Invoke<StopTaskResponse>(request, options);
}
}