using System;
using System.Collections.Generic;

public class Translation469
{
    public virtual ListResourceRecordSetsResponse ListResourceRecordSets(ListResourceRecordSetsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListResourceRecordSetsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListResourceRecordSetsResponseUnmarshaller.Instance;
    return Invoke<ListResourceRecordSetsResponse>(request, options);
}
}