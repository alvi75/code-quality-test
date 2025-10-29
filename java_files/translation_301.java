import java.util.*;

public class Translation301 {
    ublic GetLaunchTemplateDataResponse GetLaunchTemplateData(GetLaunchTemplateDataRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetLaunchTemplateDataRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetLaunchTemplateDataResponseUnmarshaller.Instance;
    return Invoke<GetLaunchTemplateDataResponse>(request, options);
}
}