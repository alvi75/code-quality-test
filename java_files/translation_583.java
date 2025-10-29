import java.util.*;

public class Translation583 {
    ublic GetFindingsResponse GetFindings(GetFindingsRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = GetFindingsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetFindingsResponseUnmarshaller.Instance;
    return Invoke<GetFindingsResponse>(request, options);
}
}