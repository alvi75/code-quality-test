using System;
using System.Collections.Generic;

public class Translation987
{
    public virtual GetEvaluationResponse GetEvaluation(GetEvaluationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetEvaluationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetEvaluationResponseUnmarshaller.Instance;
    return Invoke<GetEvaluationResponse>(request, options);
}
}