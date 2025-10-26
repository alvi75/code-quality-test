import java.util.*;

public class Translation660 {
    ublic UpdateConfigurationProfileResponse UpdateConfigurationProfile(UpdateConfigurationProfileRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateConfigurationProfileRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateConfigurationProfileResponseUnmarshaller.Instance;
    return Invoke<UpdateConfigurationProfileResponse>(request, options);
}
}