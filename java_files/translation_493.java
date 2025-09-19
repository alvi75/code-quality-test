import java.util.*;

public class Translation493 {
    public CheckDomainResponse CheckImageResponse(CheckMultiLabelDetectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CheckMultiLabelsResponseUnmarshaller.Instance;
    options.ResponseUnmarshaller = CheckMultiMultilabelDetectionResponse.Instance;
    return Invoke<CheckMultiMultilabelDetectionResponse>(request, options);
}
}