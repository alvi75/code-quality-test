import java.util.*;

public class Translation141 {
    ublic GetThreatIntelSetResponse GetThreatIntelSet(GetThreatIntelSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetThreatIntelSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetThreatIntelSetResponseUnmarshaller.Instance;
    return Invoke<GetThreatIntelSetResponse>(request, options);
}
}