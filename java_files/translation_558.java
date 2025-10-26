import java.util.*;

public class Translation558 {
    ublic GetPushTemplateResponse GetPushTemplate(GetPushTemplateRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetPushTemplateRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetPushTemplateResponseUnmarshaller.Instance;
    return Invoke<GetPushTemplateResponse>(request, options);
}
}