using System;
using System.Collections.Generic;

public class Translation198
{
    public virtual DeleteVoiceConnectorResponse DeleteVoiceConnector(DeleteVoiceConnectorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteVoiceConnectorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteVoiceConnectorResponseUnmarshaller.Instance;
    return Invoke<DeleteVoiceConnectorResponse>(request, options);
}
}