import java.util.*;

public class Translation86 {
    ublic DeleteSmsChannelResponse DeleteSmsChannel(DeleteSmsChannelRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteSmsChannelRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteSmsChannelResponseUnmarshaller.Instance;
    return Invoke<DeleteSmsChannelResponse>(request, options);
}
}