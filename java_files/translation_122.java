import java.util.*;

public class Translation122 {
    ublic virtual CancelUpdateStackResponse CancelUpdateStack(CancelUpdateStackRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CancelUpdateStackRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CancelUpdateStackResponseUnmarshaller.Instance;
    return Invoke<CancelUpdateStackResponse>(request, options);
}
}