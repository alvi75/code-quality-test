import java.util.*;

public class Translation833 {
    ublic AssociateVPCWithHostedZoneResponse AssociateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AssociateVPCWithHostedZoneRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AssociateVPCWithHostedZoneResponseUnmarshaller.Instance;
    return Invoke<AssociateVPCWithHostedZoneResponse>(request, options);
}
}