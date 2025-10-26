import java.util.*;

public class Translation707 {
    ublic DescribeSignalingChannelResponse DescribeSignalingChannel(DescribeSignalingChannelRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeSignalingChannelRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeSignalingChannelResponseUnmarshaller.Instance;
    return Invoke<DescribeSignalingChannelResponse>(request, options);
}
}