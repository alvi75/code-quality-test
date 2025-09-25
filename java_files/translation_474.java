import java.util.*;

public class Translation474 {
    public EnableLoggingResult enableLogging(EnableLoggingRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = EnableLoggingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = EnableLoggingResponseUnmarshaller.Instance;
    return Invoke<EnableLoggingResult>(request, options);
}
}