import java.util.*;

public class Translation121 {
    ublic GetDocumentAnalysisResponse GetDocumentAnalysis(GetDocumentAnalysisRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDocumentAnalysisRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDocumentAnalysisResponseUnmarshaller.Instance;
    return Invoke<GetDocumentAnalysisResponse>(request, options);
}
}