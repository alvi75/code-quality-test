using System;
using System.Collections.Generic;

public class Translation833
{
    public virtual AssociateVPCWithHostedZoneResponse AssociateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateVPCWithHostedZoneRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateVPCWithHostedZoneResponseUnmarshaller.Instance;
    return Invoke<AssociateVPCWithHostedZoneResponse>(request, options);
}
}