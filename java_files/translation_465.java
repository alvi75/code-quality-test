import java.util.*;

public class Translation465 {
    ublic CreateAlgorithmResponse CreateAlgorithm(CreateAlgorithmRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateAlgorithmRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateAlgorithmResponseUnmarshaller.Instance;
    return Invoke<CreateAlgorithmResponse>(request, options);
}
}