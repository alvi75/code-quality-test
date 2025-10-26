import java.util.*;

public class Translation930 {
    ublic CreateVariableResponse CreateVariable(CreateVariableRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateVariableRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateVariableResponseUnmarshaller.Instance;
    return Invoke<CreateVariableResponse>(request, options);
}
}