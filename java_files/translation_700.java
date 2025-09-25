import java.util.*;

public class Translation700 {
    public DisableAddOnResult disableAddOn(DisableAddOnRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DisableAddOnRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DisableAddOnResponseUnmarshaller.Instance;
    return Invoke<DisableAddOnResult>(request, options);
}
}