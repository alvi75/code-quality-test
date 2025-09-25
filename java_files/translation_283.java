import java.util.*;

public class Translation283 {
    public GetUserSourceAccountResult getUserSourceAccount(GetUserSourceAccountRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetUserSourceAccountRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetUserSourceAccountResponseUnmarshaller.Instance;
    return Invoke<GetUserSourceAccountResult>(request, options);
}
}