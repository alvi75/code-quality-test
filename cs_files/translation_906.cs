using System;
using System.Collections.Generic;

public class Translation906
{
    public virtual RebootNodeResponse RebootNode(RebootNodeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RebootNodeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RebootNodeResponseUnmarshaller.Instance;
    return Invoke<RebootNodeResponse>(request, options);
}
}