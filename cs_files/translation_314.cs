using System;
using System.Collections.Generic;

public class Translation314
{
    public virtual ListAssignmentsForHITResponse ListAssignmentsForHIT(ListAssignmentsForHITRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAssignmentsForHITRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAssignmentsForHITResponseUnmarshaller.Instance;
    return Invoke<ListAssignmentsForHITResponse>(request, options);
}
}