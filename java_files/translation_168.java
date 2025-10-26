import java.util.*;

public class Translation168 {
    ublic GetDedicatedIpResponse GetDedicatedIp(GetDedicatedIpRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDedicatedIpRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDedicatedIpResponseUnmarshaller.Instance;
    return Invoke<GetDedicatedIpResponse>(request, options);
}
}