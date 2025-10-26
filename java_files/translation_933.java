import java.util.*;

public class Translation933 {
    ublic CreateCloudFrontOriginAccessIdentityResponse CreateCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateCloudFrontOriginAccessIdentityRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateCloudFrontOriginAccessIdentityResponseUnmarshaller.Instance;
    return Invoke<CreateCloudFrontOriginAccessIdentityResponse>(request, options);
}
}