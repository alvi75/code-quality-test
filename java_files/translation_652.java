import java.util.*;

public class Translation652 {
    ublic GetApiMappingResponse GetApiMapping(GetApiMappingRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = GetApiMappingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetApiMappingResponseUnmarshaller.Instance;
    return Invoke<GetApiMappingResponse>(request, options);
}
}