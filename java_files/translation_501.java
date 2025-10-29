import java.util.*;

public class Translation501 {
    ublic CreateConfigurationSetResponse CreateConfigurationSet(CreateConfigurationSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateConfigurationSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateConfigurationSetResponseUnmarshaller.Instance;
    return Invoke<CreateConfigurationSetResponse>(request, options);
}
}