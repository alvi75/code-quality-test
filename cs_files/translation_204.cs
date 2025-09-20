using System;
using System.Collections.Generic;

public class Translation204
{
    public virtual CreateSegmentResponse CreateSegment(CreateSegmentRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateSegmentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateSegmentResponseUnmarshaller.Instance;
    return Invoke<CreateSegmentResponse>(request, options);
}
}