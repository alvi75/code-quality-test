import java.util.*;

public class Translation873 {
    ublic CreateExperimentResponse CreateExperiment(CreateExperimentRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateExperimentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateExperimentResponseUnmarshaller.Instance;
    return Invoke<CreateExperimentResponse>(request, options);
}
}