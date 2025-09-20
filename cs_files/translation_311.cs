using System;
using System.Collections.Generic;

public class Translation311
{
    public virtual UpdateStreamResponse UpdateStream(UpdateStreamRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateStreamRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateStreamResponseUnmarshaller.Instance;
    return Invoke<UpdateStreamResponse>(request, options);
}
}