using System;
using System.Collections.Generic;

public class Translation138
{
    public virtual RemoveSourceIdentifierFromSubscriptionResponse RemoveSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RemoveSourceIdentifierFromSubscriptionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RemoveSourceIdentifierFromSubscriptionResponseUnmarshaller.Instance;
    return Invoke<RemoveSourceIdentifierFromSubscriptionResponse>(request, options);
}
}