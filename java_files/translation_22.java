import java.util.*;

public class Translation22 {
    ublic TagQueueResponse TagQueue(TagQueueRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TagQueueRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TagQueueResponseUnmarshaller.Instance;
    return Invoke<TagQueueResponse>(request, options);
}
}