import java.util.*;

public class Translation708 {
    ublic AttachStaticIpResponse AttachStaticIp(AttachStaticIpRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AttachStaticIpRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AttachStaticIpResponseUnmarshaller.Instance;
    return Invoke<AttachStaticIpResponse>(request, options);
}
}