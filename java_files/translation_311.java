import java.util.*;

public class Translation311 {
    ublic UpdateStreamResponse UpdateStream(UpdateStreamRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateStreamRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateStreamResponseUnmarshaller.Instance;
    return Invoke<UpdateStreamResponse>(request, options);
}
}