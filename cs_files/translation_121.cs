using System;
using System.Collections.Generic;

public class Translation121
{
    public virtual GetDocumentAnalysisResponse GetDocumentAnalysis(GetDocumentAnalysisRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDocumentAnalysisRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDocumentAnalysisResponseUnmarshaller.Instance;
    return Invoke<GetDocumentAnalysisResponse>(request, options);
}
}