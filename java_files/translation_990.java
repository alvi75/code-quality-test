import java.util.*;

public class Translation990 {
    ublic GetLifecyclePolicyPreviewResponse GetLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetLifecyclePolicyPreviewRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetLifecyclePolicyPreviewResponseUnmarshaller.Instance;
    return Invoke<GetLifecyclePolicyPreviewResponse>(request, options);
}
}