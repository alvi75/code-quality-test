import java.util.*;

public class Translation933 {
    ublic OriginAccessIdentity createOriginAccessIdentity(CreateOriginAccessIdentityRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateOriginAccessIdentityRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateOriginAccessIdentityResponseUnmarshaller.Instance;
    return Invoke<CreateOriginAccessIdentityResponse>(request, options);
}
}