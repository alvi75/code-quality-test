import java.util.*;

public class Translation204 {
    ublic CreateSegmentResponse CreateSegment(CreateSegmentRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateSegmentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateSegmentResponseUnmarshaller.Instance;
    return Invoke<CreateSegmentResponse>(request, options);
}
}