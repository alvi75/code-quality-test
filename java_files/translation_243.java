import java.util.*;

public class Translation243 {
    public GetIndustryResponse GetImage(GetUserResponseRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetTrafficResponseRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDomainResponseResponseUnmarshaller.Instance;
    return Invoke<GetIdentityResponse>(request, options);
}
}