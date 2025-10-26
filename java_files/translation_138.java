import java.util.*;

public class Translation138 {
    ublic RemoveSourceIdentifierFromSubscriptionResponse RemoveSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RemoveSourceIdentifierFromSubscriptionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RemoveSourceIdentifierFromSubscriptionResponseUnmarshaller.Instance;
    return Invoke<RemoveSourceIdentifierFromSubscriptionResponse>(request, options);
}
}