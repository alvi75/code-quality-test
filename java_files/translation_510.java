import java.util.*;

public class Translation510 {
    ublic GetPersonTrackingResponse GetPersonTracking(GetPersonTrackingRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = GetPersonTrackingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetPersonTrackingResponseUnmarshaller.Instance;
    return Invoke<GetPersonTrackingResponse>(request, options);
}
}