using System;
using System.Collections.Generic;

public class Translation529
{
    public virtual ListVoiceConnectorTerminationCredentialsResponse ListVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListVoiceConnectorTerminationCredentialsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListVoiceConnectorTerminationCredentialsResponseUnmarshaller.Instance;
    return Invoke<ListVoiceConnectorTerminationCredentialsResponse>(request, options);
}
}