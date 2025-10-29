import java.util.*;

public class Translation982 {
    ublic GetPhoneNumberSettingsResponse GetPhoneNumberSettings(GetPhoneNumberSettingsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetPhoneNumberSettingsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetPhoneNumberSettingsResponseUnmarshaller.Instance;
    return Invoke<GetPhoneNumberSettingsResponse>(request, options);
}
}