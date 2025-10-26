import java.util.*;

public class Translation124 {
    ublic SetInstanceProtectionResponse SetInstanceProtection(SetInstanceProtectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SetInstanceProtectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SetInstanceProtectionResponseUnmarshaller.Instance;
    return Invoke<SetInstanceProtectionResponse>(request, options);
}
}