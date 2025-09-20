using System;
using System.Collections.Generic;

public class Translation86
{
    public virtual DeleteSmsChannelResponse DeleteSmsChannel(DeleteSmsChannelRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteSmsChannelRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteSmsChannelResponseUnmarshaller.Instance;
    return Invoke<DeleteSmsChannelResponse>(request, options);
}
}