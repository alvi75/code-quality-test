using System;
using System.Collections.Generic;

public class Translation576
{
    public virtual DeleteLogPatternResponse DeleteLogPattern(DeleteLogPatternRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteLogPatternRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteLogPatternResponseUnmarshaller.Instance;
    return Invoke<DeleteLogPatternResponse>(request, options);
}
}