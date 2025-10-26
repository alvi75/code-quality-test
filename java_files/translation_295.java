import java.util.*;

public class Translation295 {
    ublic GetCloudFrontOriginAccessIdentityConfigResponse GetCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetCloudFrontOriginAccessIdentityConfigRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetCloudFrontOriginAccessIdentityConfigResponseUnmarshaller.Instance;
    return Invoke<GetCloudFrontOriginAccessIdentityConfigResponse>(request, options);
}
}