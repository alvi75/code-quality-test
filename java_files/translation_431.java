import java.util.*;

public class Translation431 {
    ublic PostAgentProfileResponse PostAgentProfile(PostAgentProfileRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PostAgentProfileRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PostAgentProfileResponseUnmarshaller.Instance;
    return Invoke<PostAgentProfileResponse>(request, options);
}
}