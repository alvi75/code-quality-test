import java.util.*;

public class Translation837 {
    ublic DisassociateConnectionFromLagResponse DisassociateConnectionFromLag(DisassociateConnectionFromLagRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DisassociateConnectionFromLagRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DisassociateConnectionFromLagResponseUnmarshaller.Instance;
    return Invoke<DisassociateConnectionFromLagResponse>(request, options);
}
}