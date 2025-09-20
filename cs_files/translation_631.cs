using System;
using System.Collections.Generic;

public class Translation631
{
    public virtual DeleteVoiceConnectorOriginationResponse DeleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteVoiceConnectorOriginationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteVoiceConnectorOriginationResponseUnmarshaller.Instance;
    return Invoke<DeleteVoiceConnectorOriginationResponse>(request, options);
}
}