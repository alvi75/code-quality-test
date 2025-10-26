import java.util.*;

public class Translation635 {
    ublic StartContentModerationResponse StartContentModeration(StartContentModerationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StartContentModerationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StartContentModerationResponseUnmarshaller.Instance;
    return Invoke<StartContentModerationResponse>(request, options);
}
}