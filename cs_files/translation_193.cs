using System;
using System.Collections.Generic;

public class Translation193
{
    public virtual GetAssignmentResponse GetAssignment(GetAssignmentRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetAssignmentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetAssignmentResponseUnmarshaller.Instance;
    return Invoke<GetAssignmentResponse>(request, options);
}
}