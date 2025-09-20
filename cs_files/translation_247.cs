using System;
using System.Collections.Generic;

public class Translation247
{
    public virtual CreateParticipantConnectionResponse CreateParticipantConnection(CreateParticipantConnectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateParticipantConnectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateParticipantConnectionResponseUnmarshaller.Instance;
    return Invoke<CreateParticipantConnectionResponse>(request, options);
}
}