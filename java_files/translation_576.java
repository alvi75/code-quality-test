import java.util.*;

public class Translation576 {
    ublic DeleteLogPatternResponse DeleteLogPattern(DeleteLogPatternRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteLogPatternRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteLogPatternResponseUnmarshaller.Instance;
    return Invoke<DeleteLogPatternResponse>(request, options);
}
}