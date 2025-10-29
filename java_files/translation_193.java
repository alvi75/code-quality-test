import java.util.*;

public class Translation193 {
    ublic GetAssignmentResponse GetAssignment(GetAssignmentRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = GetAssignmentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetAssignmentResponseUnmarshaller.Instance;
    return Invoke<GetAssignmentResponse>(request, options);
}
}