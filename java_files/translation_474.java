import java.util.*;

public class Translation474 {
    ublic EnableLoggingResponse EnableLogging(EnableLoggingRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = EnableLoggingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = EnableLoggingResponseUnmarshaller.Instance;
    return Invoke<EnableLoggingResponse>(request, options);
}
}