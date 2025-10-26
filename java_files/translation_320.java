import java.util.*;

public class Translation320 {
    ublic UpdateApiKeyResponse UpdateApiKey(UpdateApiKeyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateApiKeyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateApiKeyResponseUnmarshaller.Instance;
    return Invoke<UpdateApiKeyResponse>(request, options);
}
}