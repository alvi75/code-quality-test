import java.util.*;

public class Translation987 {
    ublic GetEvaluationResponse GetEvaluation(GetEvaluationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetEvaluationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetEvaluationResponseUnmarshaller.Instance;
    return Invoke<GetEvaluationResponse>(request, options);
}
}