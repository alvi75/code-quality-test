import java.util.*;

public class Translation37 {
    ublic GetIceServerConfigResponse GetIceServerConfig(GetIceServerConfigRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetIceServerConfigRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetIceServerConfigResponseUnmarshaller.Instance;
    return Invoke<GetIceServerConfigResponse>(request, options);
}
}