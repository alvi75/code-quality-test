import java.util.*;

public class Translation496 {
    ublic StartTaskResponse StartTask(StartTaskRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StartTaskRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StartTaskResponseUnmarshaller.Instance;
    return Invoke<StartTaskResponse>(request, options);
}
}