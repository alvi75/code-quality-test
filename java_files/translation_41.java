import java.util.*;

public class Translation41 {
    ublic UpdateConfigurationSetSendingEnabledResponse UpdateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateConfigurationSetSendingEnabledRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateConfigurationSetSendingEnabledResponseUnmarshaller.Instance;
    return Invoke<UpdateConfigurationSetSendingEnabledResponse>(request, options);
}
}